package com.example.raaowll.sunshine.com.example.raaowll.sunshine.app.test;
import android.test.suitebuilder.TestSuiteBuilder;
import junit.framework.Test;
/**
 * Created by Raaowll on 20-08-2014.
 */
public class fullTestSuite {
    public static Test suite(){
        return new TestSuiteBuilder(fullTestSuite.class).includeAllPackagesUnderHere().build();
    }

    public fullTestSuite(){
        super();
    }
}
