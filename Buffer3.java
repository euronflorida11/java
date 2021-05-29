import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffer3 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 入力パラメータを読み込む
    String input = br.readLine();
    String[] param = input.split(" ");//入力値を空白で分解する
    String type = null ;
    Integer sum = 0 ;
    for(int idx = 0 ; idx < param.length; idx ++){//①
    if(param[idx].equals("+") || param[idx].equals("-")){//②
          type = param[idx] ;
    }else{
          Integer num = Integer.parseInt(param[idx]);//③
          if(type != null){//④
              if(type.equals("+")){
                  sum = sum + num;
              }else if(type.equals("-")){
                  sum = sum - num;
              }
          }else{
            sum = num ;//⑤
          }
        }
    }
    System.out.println(sum);
  }
}
