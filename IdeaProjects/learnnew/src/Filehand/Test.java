package Filehand;

import java.io.IOException;

public class Test {
    class AddStrings {
        String name1;
        String name2;
        public String addstrings(String name1, String name2) {
            return name1 + name2;
        }

    }
    public void main(String[] args) throws IOException {
       AddStrings addStrings=new AddStrings();
       addStrings.name1="shankar";
       addStrings.name2="Bojanki";

    }
}
