import java.util.Arrays;

public final class lnc
{
  public static final String[] a = { "2147483647 AS _id", "0 AS row_type", "activity_id", "author_id", "name", "avatar_url", "author_gender", "plus_one_data", "total_comment_count", "loc", "created", "content_flags", "activity_flags", "annotation", "title", "original_author_id", "original_author_name", "original_author_avatar_url", "original_comment_count", "original_collexion_name", "comment", "last_activity", "source_name", "square_update", "square_reshare_update", "relateds", "embed", "embed_deep_link", "embed_appinvite", "source_id", "payload", "domain", "birthday", "author_annotation", "acl_display", "num_reshares", "original_activity_id", "context_specific_data", "promoted_post_data", "unique_activity_id", "i_data", "youtube_permalink_url", "permalink" };
  public static final String[] b = { "_id", "0 AS row_type", "activity_id", "author_id", "name", "avatar_url", "author_gender", "plus_one_data", "total_comment_count", "loc", "created", "content_flags", "activity_flags", "annotation", "title", "original_author_id", "original_author_name", "original_author_avatar_url", "original_comment_count", "original_collexion_name", "comment", "youtube_permalink_url", "permalink" };
  public static final String[] c;
  
  static
  {
    String[] arrayOfString1 = (String[])Arrays.copyOf(a, a.length);
    c = arrayOfString1;
    String str1 = String.valueOf(c[21]);
    String str2;
    String[] arrayOfString2;
    String str3;
    if (str1.length() != 0)
    {
      str2 = "1 AS ".concat(str1);
      arrayOfString1[21] = str2;
      arrayOfString2 = c;
      str3 = String.valueOf(c[40]);
      if (str3.length() == 0) {
        break label499;
      }
    }
    label499:
    for (String str4 = "NULL AS ".concat(str3);; str4 = new String("NULL AS "))
    {
      arrayOfString2[40] = str4;
      return;
      str2 = new String("1 AS ");
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lnc
 * JD-Core Version:    0.7.0.1
 */