package com.liuhui.iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liuhui
 * @date 2018-04-28 下午2:25
 */
public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        // 查找小说
        ItemIterator iterator = new BookShelfIterator(ItemType.FICTION, new BookShelf());
        LOGGER.info("正在查找小说类图书");
        while (iterator.hasNext()) {
            Item nextItem = iterator.next();
            LOGGER.info("找到了符合条件的图书，书名为：{}", nextItem.toString());
        }

        // 查找IT
        ItemIterator iterator2 = new BookShelfIterator(ItemType.IT, new BookShelf());
        LOGGER.info("正在查找IT类图书");
        while (iterator2.hasNext()) {
            Item nextItem = iterator2.next();
            LOGGER.info("找到了符合条件的图书，书名为：{}", nextItem.toString());
        }

        // 查找漫画
        ItemIterator iterator3 = new BookShelfIterator(ItemType.CARTOON, new BookShelf());
        LOGGER.info("正在查找漫画类图书");
        while (iterator3.hasNext()) {
            Item nextItem = iterator3.next();
            LOGGER.info("找到了符合条件的图书，书名为：{}", nextItem.toString());
        }
    }

}
