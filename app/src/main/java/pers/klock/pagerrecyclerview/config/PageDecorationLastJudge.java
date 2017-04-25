package pers.klock.pagerrecyclerview.config;

/**
 * Created by ZhaoRongZhi on 2017-04-25
 *
 * @descr
 */

public interface PageDecorationLastJudge {
    /**
     * Is the last row in one page
     *
     * @param position
     * @return
     */
    boolean isLastRow(int position);

    /**
     * Is the last Colum in one row;
     *
     * @param position
     * @return
     */
    boolean isLastColumn(int position);

    boolean isPageLast(int position);
}
