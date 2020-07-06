package dataproviders;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.testng.annotations.DataProvider;
import pojo.RegisterData;
import pojo.ValueCurrency;
import pojo.searchProduct;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class dataProviders {
       @DataProvider(name = "getWrongUserDataFromJson")
    private Object[][] getWrongUserDataFromJson() throws FileNotFoundException {
        JsonElement jsonData = new JsonParser().parse(new FileReader("src/test/resources/Data/newUser.json"));
        JsonElement dataset = jsonData.getAsJsonObject().get("dataset");

        List<RegisterData> loginData = new Gson().fromJson(dataset, new TypeToken<List<RegisterData>>() {}.getType());
        Object[] [] returnValue = new Object[loginData.size()][1];

        int index = 0;
        for(Object [] each: returnValue){
            each[0]= loginData.get(index++);

        }
        return returnValue;
    }
    @DataProvider(name = "getSearchProduct")
    private Object[][] getSearchProduct() throws FileNotFoundException {
        JsonElement jsonData = new JsonParser().parse(new FileReader("src/test/resources/Data/searchProduct.json"));
        JsonElement dataset = jsonData.getAsJsonObject().get("dataset");

        List<searchProduct> loginData = new Gson().fromJson(dataset, new TypeToken<List<searchProduct>>() {}.getType());
        Object[] [] returnValue = new Object[loginData.size()][1];

        int index = 0;
        for(Object [] each: returnValue){
            each[0]= loginData.get(index++);

        }
        return returnValue;
    }
    @DataProvider(name = "getCurrency")
    private Object[][] getCurrency() throws FileNotFoundException {
        JsonElement jsonData = new JsonParser().parse(new FileReader("src/test/resources/Data/Currency.json"));
        JsonElement dataset = jsonData.getAsJsonObject().get("dataset");

        List<ValueCurrency> loginData = new Gson().fromJson(dataset, new TypeToken<List<ValueCurrency>>() {}.getType());
        Object[] [] returnValue = new Object[loginData.size()][1];

        int index = 0;
        for(Object [] each: returnValue){
            each[0]= loginData.get(index++);

        }
        return returnValue;
    }

}
