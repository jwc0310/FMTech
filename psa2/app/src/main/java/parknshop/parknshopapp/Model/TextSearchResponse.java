package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import parknshop.parknshopapp.Model.Category.CategoryHierarchyData;

/**
 * Created by chrisyu on 16/3/12.
 */
public class TextSearchResponse {
    private List<Product> products;
    private List<Facet> facets;
    private List<Sorts> sorts;
    private List<Breadcrumbs> breadcrumbs;
    private String currentQuery;
    private String freeTextSearch;
    private String categoryCode;
    private Pagination pagination;
    private CategoryHierarchyData categoryHierarchyData;


    public void setTotalResult(int count) {
        Pagination pagination = new Pagination();
        pagination.totalResults = count;

        this.pagination = pagination;
    }

    public String getTotalResult() {
        return pagination != null ? Integer.toString(pagination.totalResults) : "0";
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products != null ? products : new ArrayList<Product>();
    }

    public List<Sorts> getSorts() {
        return sorts != null ? sorts : new ArrayList<Sorts>();
    }

    public String getFreeTextSearch() {
        return freeTextSearch;
    }

    public String getCurrentQuery() {
        return currentQuery;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public Map<String, List<Facet.Value>> getFilterData() {
        Map<String, List<Facet.Value>> dataMap = new HashMap<String, List<Facet.Value>>();
        if(facets == null)
            return dataMap;
        for (Facet facet : facets) {
            if (facet.name != null) {
                dataMap.put(facet.name, facet.values);
            }
        }

        return dataMap;
    }

    public CategoryHierarchyData getCategoryHierarchyData() {
        return categoryHierarchyData != null ? categoryHierarchyData : new CategoryHierarchyData();
    }

    public List<Facet> getFacet() {
        return facets;
    }

    public class Facet {
        private String name;
        private List<Value> values;

        public List<Value> getValues() {
            return values;
        }

        public class Value {
            private String name;
            private int count;
            private String query;
            public boolean isSelected;

            public String getName() {
                return name;
            }

            public int getCount() {
                return count;
            }

            public String getCountString() {
                return name != null ? name + " ( " + count + " )" : null;
            }

            public String getLastQuery() {
                String[] querySplit = query.split(":");
                return query != null ? querySplit[querySplit.length - 1] : "";
            }
        }
    }

    public static class Sorts {
        private String code;
        private String name;
        private boolean selected;

        public void setCode(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public boolean isSelected() {
            return selected;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }

        public static Sorts newInstance() {
            return new Sorts();
        }
    }

    public class Breadcrumbs {
        private String facetCode;
        private String facetName;
        private String facetValueCode;
        private String facetValueName;
        private String removeQuery;
        private String truncateQuery;

        public String getFacetCode() {
            return facetCode;
        }

        public String getFacetName() {
            return facetName;
        }

        public String getFacetValueCode() {
            return facetValueCode;
        }

        public String getFacetValueName() {
            return facetValueName;
        }

        public String getRemoveQuery() {
            return removeQuery;
        }

        public String getTruncateQuery() {
            return truncateQuery;
        }
    }

    public class Pagination {
        private int totalResults;
    }


}
