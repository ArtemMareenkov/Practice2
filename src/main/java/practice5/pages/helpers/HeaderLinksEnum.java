package practice5.pages.helpers;

/**
 * Created by Serhii on 14-Dec-16.
 */
public enum HeaderLinksEnum {

    TODAYS_DEALS("Deals"),
    GIFT_CARDS_REGISTRY("Gift Cards & Registry"),
    SELL("Sell");

    private String partOfLinkText;

    HeaderLinksEnum(String partOfLinkText) {
        this.partOfLinkText = partOfLinkText;
    }

    public String getPartOfLinkText() {
        return partOfLinkText;
    }
}
