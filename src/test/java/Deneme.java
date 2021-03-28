import helper.Amenities;
import helper.AmenitiesElements;
import helper.OneeMethods;
import org.testng.annotations.Test;

public class Deneme implements OneeMethods, AmenitiesElements {
    @Test
    public void test(){
        String string = "20";
        int i=Integer.parseInt("200");
        String[] parts = string.split(" ");
        String part1 = parts[0];
        System.out.println(part1);
        System.out.println(getByCode("HAMMAM").toString());
        System.out.println(getAmenitiesElement(Amenities.HAMMAM));

    }
}
