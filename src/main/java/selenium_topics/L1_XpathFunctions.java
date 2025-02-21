package selenium_topics;

public class L1_XpathFunctions {
    public static void main(String[] args) {

        /**


         //htmltag[@attr='']
         //htmltag[func()='']

         functions of xpath

         text()
         //htmlTag[text()='']

         contains()
         //htmlTag[contains(text(),'')]


         how to move to child from parent = //body/table
         how to move to parent from child  = //table/..
         //body[//table]


         following-sibling
         //td[text()='Giovanni Rovelli']/following-sibling::td
         //td[text()='Helen Bennett']/following-sibling::td

         preceding-sibling
         //td[text()='Giovanni Rovelli']/preceding-sibling::td
         //td[text()='Francisco Chang']/preceding-sibling::td
         //td[text()='Germany']/preceding-sibling::td[2]

         descendent
         (//table/descendant:td)[last()]

         last()
         (//table//td)[last()]
         (//div[@class='inventory_item_name '])[last()]
         (//div[@class='inventory_item_name '])[last()-2]

         starts-with()
         //input[starts-with(@placeholder,'Desired')]

         ends-with()

         Shadow Dom






         */

    }
}
