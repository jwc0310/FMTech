import java.util.HashMap;

public final class jim
{
  public static final HashMap<String, String> a;
  public static final HashMap<String, String> b;
  public static final HashMap<String, String> c;
  private static HashMap<String, String> d;
  
  static
  {
    HashMap localHashMap1 = new HashMap();
    c = localHashMap1;
    localHashMap1.put("_id", "circles.rowid AS _id");
    c.put("circle_id", "circles.circle_id AS circle_id");
    c.put("circle_name", "circle_name");
    c.put("sort_key", "sort_key");
    c.put("type", "type");
    c.put("semantic_hints", "semantic_hints");
    c.put("for_sharing", "for_sharing");
    c.put("contact_count", "contact_count");
    c.put("member_ids", "group_concat(link_person_id, '|') AS member_ids");
    c.put("show_order", "show_order");
    c.put("volume", "volume");
    c.put("notifications_enabled", "notifications_enabled");
    c.put("last_volume_sync", "last_volume_sync");
    HashMap localHashMap2 = new HashMap();
    a = localHashMap2;
    localHashMap2.put("_id", "contacts.rowid AS _id");
    a.put("person_id", "contacts.person_id AS person_id");
    a.put("gaia_id", "gaia_id");
    a.put("avatar", "avatar");
    a.put("name", "name");
    a.put("sort_key", "contacts.sort_key AS sort_key");
    a.put("last_updated_time", "last_updated_time");
    a.put("profile_type", "profile_type");
    a.put("in_my_circles", "in_my_circles");
    a.put("for_sharing", "(CASE WHEN person_id IN (SELECT link_person_id FROM circle_contact WHERE link_circle_id IN (SELECT circle_id FROM circles WHERE for_sharing != 0)) THEN 1 ELSE 0 END) AS for_sharing");
    a.put("blocked", "blocked");
    a.put("verified", "verified");
    a.put("interaction_sort_key", "interaction_sort_key");
    a.put("packed_circle_ids", "group_concat(link_circle_id, '|') AS packed_circle_ids");
    a.put("contact_update_time", "contact_update_time");
    a.put("contact_proto", "contact_proto");
    a.put("profile_update_time", "profile_update_time");
    a.put("profile_proto", "profile_proto");
    a.put("people_data_proto", "people_data_proto");
    a.put("in_same_visibility_group", "in_same_visibility_group");
    HashMap localHashMap3 = new HashMap(a);
    b = localHashMap3;
    localHashMap3.put("email", "email");
    HashMap localHashMap4 = new HashMap(b);
    d = localHashMap4;
    localHashMap4.put("_id", "_id");
    d.put("person_id", "person_id");
    d.put("packed_circle_ids", "packed_circle_ids");
    d.put("phone", "phone");
    d.put("phone_type", "phone_type");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jim
 * JD-Core Version:    0.7.0.1
 */