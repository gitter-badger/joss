package nl.tweeenveertig.openstack.model;

public interface PaginationMap {

    /**
    * Gets the marker text (ie, the name of the last record of the previous page) for navigating
    * to another page. The OpenStack API requires this information (why don't they use a regular
    * offset?).
    * @param page the page to get the appropriate marker for
    * @return the marker for the required page
    */
    public String getMarker(Integer page);

    /**
    * Returns the number of pages
    * @return number of pages
    */
    public Integer getNumberOfPages();

    /**
    * Returns the page size
    * @return page size
    */
    public Integer getPageSize();

    /**
    * Returns the number of records
    * @return the number of records
    */
    public Integer getNumberOfRecords();

}
