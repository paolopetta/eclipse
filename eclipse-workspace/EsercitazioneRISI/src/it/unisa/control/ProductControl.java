package it.unisa.control;

import it.unisa.model.Cart;
import it.unisa.model.ProductBean;
import it.unisa.model.ProductModelDM;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/ProductControl")
public class ProductControl extends HttpServlet {
    static ProductModelDM model = new ProductModelDM();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cart<ProductBean> cart = (Cart<ProductBean>) request.getSession().getAttribute("cart");
        if(cart == null) {
            cart = new Cart<ProductBean>();
            request.getSession().setAttribute("cart", cart);
        }

        String message = "";
        String sort = request.getParameter("sort");
        String action = request.getParameter("action");

        try {
            if(action != null){
                switch (action) {
                    case "details": {
                        String id = request.getParameter("id");
                        request.removeAttribute("product");
                        request.setAttribute("product", model.doRetrieveByKey(Integer.parseInt(id)));
                        break;
                    }
                    case "addCart": {
                        String id = request.getParameter("id");
                        ProductBean bean = model.doRetrieveByKey(Integer.parseInt(id));
                        if (bean != null && !bean.isEmpty()) {
                            cart.addItem(bean);
                        }
                        message = "prodotto "+id+" aggiunto al carrello";
                        break;
                    }
                    case "clearCart": {
                        cart.deleteItems();
                        message = "carrello pulito";
                        break;
                    }
                    case "deleteToCart": {
                        int id = Integer.parseInt(request.getParameter("id"));
                        ProductBean bean = model.doRetrieveByKey(id);
                        if(bean != null && !bean.isEmpty()){
                            cart.deleteItem(bean);
                            message="prodotto "+ bean.getName() +" tolto dal carrello";
                        }
                        break;
                    }
                    case "insert": {
                        String name = request.getParameter("name");
                        String description = request.getParameter("description");
                        int price = Integer.parseInt(request.getParameter("price"));
                        int quantity = Integer.parseInt(request.getParameter("quantity"));

                        ProductBean bean = new ProductBean();
                        bean.setName(name);
                        bean.setDescription(description);
                        bean.setPrice(price);
                        bean.setQuantity(quantity);

                        model.doSave(bean);
                        message = bean.getName()+" aggiunto";
                        break;
                    }
                }
            }
        } catch (SQLException | NumberFormatException pluto){
            System.out.println("Error: "+ pluto.getMessage());
            request.setAttribute("error", pluto.getMessage());
        }

        request.setAttribute("message", message);
        request.setAttribute("cart", cart);

        try {
            request.removeAttribute("products");
            request.setAttribute("products", model.doRetrieveAll(sort));
        } catch (SQLException pippo) {
            System.out.println("Error: "+ pippo.getMessage());
            request.setAttribute("error", pippo.getMessage());
        }

        RequestDispatcher disp = this.getServletContext().getRequestDispatcher("/ProductView.jsp");
        disp.forward(request, response);
    }
}
