

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;

class MyClassFuzzTest1 {
    @FuzzTest
    void myFuzzTest(FuzzedDataProvider data) {
        System.out.println("Hello!");
    }
}
