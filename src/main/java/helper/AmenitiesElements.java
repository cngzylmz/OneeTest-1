package helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public interface AmenitiesElements{


    default String  getAmenitiesElement(Amenities amenitiesElement) {
        if (amenitiesElement != null) {


            switch (amenitiesElement) {
                case BATHROBE:
                    return "//div[@role='dialog']/div[@role='document']//div[@role='tablist']/div[4]/div[@role='tabpanel']//div[@class='ant-row']/div[1]//span[@class='ant-checkbox']/input";
                case IRON_AND_IRONING_BOARD:
                    return "//div[@role='dialog']/div[@role='document']//div[@role='tablist']/div[4]/div[@role='tabpanel']//div[@class='ant-row']/div[2]//span[@class='ant-checkbox']/input";
                case WIFI:
                    return "//div[@role='dialog']/div[@role='document']//div[@role='tablist']/div[4]/div[@role='tabpanel']//div[@class='ant-row']/div[3]//span[@class='ant-checkbox']/input";
                case FLAT_OR_SCREEN_TV:
                    return "//div[@role='dialog']/div[@role='document']//div[@role='tablist']/div[4]/div[@role='tabpanel']//div[@class='ant-row']/div[4]//span[@class='ant-checkbox']/input";
                case SPA:
                    return "//div[@role='dialog']/div[@role='document']//div[@role='tablist']/div[4]/div[@role='tabpanel']//div[@class='ant-row']/div[5]//span[@class='ant-checkbox']/input";
                case HAMMAM:
                    return "//div[@role='dialog']/div[@role='document']//div[@role='tablist']/div[4]/div[@role='tabpanel']//div[@class='ant-row']/div[6]//span[@class='ant-checkbox']/input";
                case SAUNA:
                    return "//div[@role='dialog']/div[@role='document']//div[@role='tablist']/div[4]/div[@role='tabpanel']//div[@class='ant-row']/div[7]//span[@class='ant-checkbox']/input";
                case POOL_TABLE:
                    return "//div[@role='dialog']/div[@role='document']//div[@role='tablist']/div[4]/div[@role='tabpanel']//div[@class='ant-row']/div[8]//span[@class='ant-checkbox']/input";
                case HOT_TUB:
                    return "//div[@role='dialog']/div[@role='document']//div[@role='tablist']/div[4]/div[@role='tabpanel']//div[@class='ant-row']/div[9]//span[@class='ant-checkbox']/input";
                case TABLE_TENNIS:
                    return "//div[@role='dialog']/div[@role='document']//div[@role='tablist']/div[4]/div[@role='tabpanel']//div[@class='ant-row']/div[10]//span[@class='ant-checkbox']/input";
                case MOSQUITO_NET:
                    return "//div[@role='dialog']/div[@role='document']//div[@role='tablist']/div[4]/div[@role='tabpanel']//div[@class='ant-row']/div[11]//span[@class='ant-checkbox']/input";
                case COFFEE_MACHINE:
                    return "";
                case INDOOR_FIRE_PLACE:
                    return "1";
                case AIR_CONDITIONING:
                    return "1";
                case TOWELS_AND_LINENS:
                    return "1";
                case GYM_FACILITIES:
                    return "1";
                case PET_FRIENDLY:
                    return "1";
                case SEPARATE_BAR_AREA:
                    return "1";
                case CHILD_HIGHCHAIR:
                    return "1";
                case FULLY_EQUIPPED_KITCHEN:
                    return "1";
                case OFFICE_WORKSPACE:
                    return "1";
                case STEAM_ROOM:
                    return "1";
                case BLACK_OUT_BLINDS:
                    return "1";
                case CHILD_COT:
                    return "1";
                case INDOOR_POOL:
                    return "1";
                case HEATED_INDOOR_POOL:
                    return "1";
                case TUMBLE_DRYER:
                    return "1";
                case UNDER_FLOOR_HEATING:
                    return "1";
                case ELEVATOR:
                    return "1";
                case WINE_CELLAR:
                    return "1";
                case ROOF_TERRACE:
                    return "1";
                case MASSAGE_ROOM:
                    return "1";
                case HAIR_DRYER:
                    return "1";
                case WET_BAR:
                    return "1";














                default:
                    return "0";
            }
        }

        return null;

    }


}

