package parknshop.parknshopapp.Model;

/**
 * Created by Howard Chang on 2015/12/9
 */
public class PushMemberHistoryBody {

    private String user_id;
    private int offset;

    public PushMemberHistoryBody(String user_id, int offset) {
        this.user_id = user_id;
        this.offset = offset;
    }
}


