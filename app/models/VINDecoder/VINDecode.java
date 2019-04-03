
package models.VINDecoder;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Count",
    "Message",
    "SearchCriteria",
    "Results"
})
public class VINDecode
{

    @JsonProperty("Count")
    private Integer count;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("SearchCriteria")
    private String searchCriteria;
    @JsonProperty("Results")
    private List<Result> results = null;

    @JsonProperty("Count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("Count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("Message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("Message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("SearchCriteria")
    public String getSearchCriteria() {
        return searchCriteria;
    }

    @JsonProperty("SearchCriteria")
    public void setSearchCriteria(String searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    @JsonProperty("Results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("Results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

}
