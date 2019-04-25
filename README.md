# spring-exercise1

## Project initiation
  1. Clone this project or create a new empty maven project
  1. Add the following dependencies in pom file
     ```<properties>
           <org.springframework.version>4.0.2.RELEASE</org.springframework.version>
      </properties>
      <dependencies>
          <dependency>
              <groupId>org.springframework</groupId>
              <artifactId>spring-context</artifactId>
              <version>${org.springframework.version}</version>
          </dependency>
          <dependency>
              <groupId>org.springframework</groupId>
              <artifactId>spring-core</artifactId>
              <version>${org.springframework.version}</version>
          </dependency>
      </dependencies>
    
    
  3. Create a file named beans.xml anywhere in classpath e.g. resources folder
   with the following content  
     ```
     <?xml version="1.0" encoding="UTF-8"?>
     <beans xmlns="http://www.springframework.org/schema/beans"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
          <!-- Your beans here -->
     </beans>

 4. Create the followint enum
       ````import java.util.regex.Pattern;
           
           public enum  CreditCardType {
               UNKNOWN,
               VISA("^4[0-9]{12}(?:[0-9]{3}){0,2}$"),
               MASTERCARD("^(?:5[1-5]|2(?!2([01]|20)|7(2[1-9]|3))[2-7])\\d{14}$"),
               AMERICAN_EXPRESS("^3[47][0-9]{13}$"),
               DINERS_CLUB("^3(?:0[0-5]\\d|095|6\\d{0,2}|[89]\\d{2})\\d{12,15}$"),
               DISCOVER("^6(?:011|[45][0-9]{2})[0-9]{12}$"),
               JCB("^(?:2131|1800|35\\d{3})\\d{11}$"),
               CHINA_UNION_PAY("^62[0-9]{14,17}$");
           
               private Pattern pattern;
           
               CreditCardType() {
                   this.pattern = null;
               }
           
               CreditCardType(String pattern) {
                   this.pattern = Pattern.compile(pattern);
               }
           
           
               public final Pattern getPattern() {
                   return pattern;
               }
           }

1. Create a pojo class defining a CreditCard with following fields
   1. Credit Card Number
   1. pin number
   1. Credit Card Holder Name
   1. Expiry Date
1. Create a prototype bean for this in beans.xml
1. Create a service class which implements following interface
        ````
        import com.mk.spring.exercise1.pojo.CreditCard;
        import com.mk.spring.exercise1.pojo.CreditCardType;
        
        public interface ICreditCardTypeDetectorService {
            CreditCardType getCreditCardType(CreditCard card);
        }
1. Define the implementation for the same
1. Define the singleton bean for the service
1. Test the implementation in main class.