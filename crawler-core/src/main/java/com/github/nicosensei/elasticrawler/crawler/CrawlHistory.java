/**
 * 
 */
package com.github.nicosensei.elasticrawler.crawler;

import java.util.ArrayList;

/**
 * The crawl history is a store of {@link CrawlUrl} that have already been processed.
 * 
 * @author nicolas
 *
 */
public interface CrawlHistory {

	/**
	 * Adds processed {@link CrawlUrl} to the crawl history
	 * @param crawlURLs
	 */
	void add(CrawlUrl ... crawlURLs);
	
	/**
	 * Finds out whether the given URLs have already been visited.
	 * @param urls
	 * @return an {@link ArrayList} of boolean, one per URL parameter.
	 */
	ArrayList<Boolean> alreadyVisited(String ... urls);
	
}
