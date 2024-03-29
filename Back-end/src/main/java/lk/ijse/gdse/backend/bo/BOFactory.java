package lk.ijse.gdse.backend.bo;

import lk.ijse.gdse.backend.bo.custom.impl.CustomerBOImpl;
import lk.ijse.gdse.backend.bo.custom.impl.ItemBOImpl;
import lk.ijse.gdse.backend.bo.custom.impl.OrderDetailBOImpl;
import lk.ijse.gdse.backend.bo.custom.impl.PlaceOrderBOImpl;

public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory(){}

    public static BOFactory getBoFactory(){
        return (boFactory==null) ? boFactory = new BOFactory() : boFactory;
    }
    public enum BOTypes{
        CUSTOMERBO,ITEMBO,PLACEORDERBO,ORDERDETAILBO
    }
    public <T extends SuperBO>T getBO(BOTypes boTypes){

        switch (boTypes){
            case CUSTOMERBO:
                return (T) new CustomerBOImpl();
            case ITEMBO:
                return (T) new ItemBOImpl();
            case PLACEORDERBO:
                return (T) new PlaceOrderBOImpl();
            case ORDERDETAILBO:
                return (T) new OrderDetailBOImpl();
        }
        return null;
    }
}
