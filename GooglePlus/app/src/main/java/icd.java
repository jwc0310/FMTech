import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class icd
  extends kbw
{
  public String a;
  private final String b;
  private final String c;
  private final String d;
  private final String e;
  
  public icd(Context paramContext, kcg paramkcg, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    super(paramContext, paramkcg, "POST", new ice(paramContext, paramkcg.a, paramString5), "https://android.googleapis.com/gcm/groups", "application/json");
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
  }
  
  public final void a(ByteBuffer paramByteBuffer, String paramString)
  {
    try
    {
      if (paramByteBuffer.hasArray()) {}
      for (String str1 = new String(paramByteBuffer.array(), paramByteBuffer.arrayOffset(), paramByteBuffer.limit());; str1 = new String(efj.a(paramByteBuffer)))
      {
        JSONObject localJSONObject = new JSONObject(str1);
        this.a = localJSONObject.getString("notification_key");
        if (Log.isLoggable("GcmManager", 3))
        {
          String str2 = this.b;
          String str3 = this.a;
          new StringBuilder(49 + String.valueOf(str2).length() + String.valueOf(str3).length()).append("executeHttpOperation ").append(str2).append(" SUCCESS - destinationToken ").append(str3);
        }
        if (!t()) {
          break;
        }
        c(paramByteBuffer, localJSONObject.toString(2));
        return;
      }
      return;
    }
    catch (JSONException localJSONException)
    {
      throw new IOException(localJSONException);
    }
  }
  
  public final byte[] e()
  {
    try
    {
      JSONArray localJSONArray = new JSONArray();
      localJSONArray.put(this.c);
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("registration_ids", localJSONArray);
      localJSONObject.put("notification_key_name", this.d);
      if (!TextUtils.isEmpty(this.e)) {
        localJSONObject.put("notification_key", this.e);
      }
      localJSONObject.put("operation", this.b);
      byte[] arrayOfByte = localJSONObject.toString().getBytes();
      return arrayOfByte;
    }
    catch (JSONException localJSONException)
    {
      Log.e("GcmManager", "Failed to create post data", localJSONException);
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     icd
 * JD-Core Version:    0.7.0.1
 */