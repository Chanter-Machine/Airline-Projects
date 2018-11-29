package com.airline.services.strategy.sorting.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolUtil {
	public static ExecutorService getThreadPool() {
		return Executors.newCachedThreadPool();
	}
}
