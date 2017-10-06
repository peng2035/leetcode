package com.bobby.peng.leetcode.solution.local;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

/**
 * Created by peng2035 on 2017/5/21.
 */
public class SubarraySumEqualsK {

    Map<Integer, Integer> zeroMap = new HashMap<>();

    public int subarraySum(int[] nums, int k) {
//        int result = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//
//            int temp = 0;
//            boolean flag = false;
//            int first, end;
//            for (int j = i; j < nums.length; j++) {
//                if(flag) {
//                    temp = nums[j];
//                    if(temp == 0) {
//
//                    }
//                } else {
//                    temp
//                }
//            }
//        }

        ExecutorService single = Executors.newSingleThreadExecutor();
        Future result = single.submit(new Callable<Object>() {
            @Override
            public Integer call() throws Exception {
                //todo 假设5ms

                return null;
            }
        });

        for(int i=0;i<10;i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //todo 假设1ms

                    try {
                        result.get();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

        return 0;

    }

}
