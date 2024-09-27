import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Services.CalculatorService;
import entities.Product;
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String path = "C:\\Users\\Guilherme\\Documents\\Estudos-java\\CompareTo-estudo\\in.txt";

        List<Product> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");

                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            System.out.println(CalculatorService.max(list));

        }

    }

}