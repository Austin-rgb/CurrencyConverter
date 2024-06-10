package ochie.currencyconv;

import java.util.HashMap;
import ochie.currencyconv.Cc0;

public class Cc0 {
  HashMap<String, String> convertionTable;

  Cc0() {
    convertionTable = new HashMap<String,String>();
    convertionTable.put("USD","140");
    convertionTable.put("BSP","190");
  }

  String convert(String from, String to, String value) {
    return String.valueOf(
        Float.valueOf(convertionTable.get(from))
            / Float.valueOf(convertionTable.get(to))
            * Float.valueOf(value));
  }
}
