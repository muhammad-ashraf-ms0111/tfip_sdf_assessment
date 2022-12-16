package MailMerge;

import java.io. *;
import java.util. *;
import java.util.stream.Collectors;


public class Main{

  public static void main(String[] args) throws Exception {
    
    File file = new File("thankyou.csv");
    
    Reader reader = new FileReader(file);
    BufferedReader br = new BufferedReader(reader);

      List<Data> datas = br.lines()

            .skip(1)
            .map(l -> l.split(","))
            .map(cols -> {
                Data data = new Data();
                data.setFirst_name(cols[0]);
                data.setLast_name(cols[1]);
                data.setAddress(cols[2]);
                data.setYear(cols[3]);
                return data;
            })
            .collect(Collectors.toList());

      
            for (int i=0; i < datas.size(); i++) {
              System.out.println(datas.get(i));}
            
              PrintWriter writer = new PrintWriter("src/templatefile.txt");
              writer.println(datas.get(0));
              writer.println(datas.get(1));
              writer.println(datas.get(2));
              writer.println(datas.get(3));
              writer.println(datas.get(4));
              writer.println(datas.get(5));
              writer.close();
              
              
            
            br.close();   
            reader.close();

    



          }
        }   







