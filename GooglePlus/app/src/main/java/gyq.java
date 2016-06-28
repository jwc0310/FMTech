import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.util.Property;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class gyq
  implements Animator.AnimatorListener
{
  private gyp a;
  
  public gyq(gyo paramgyo, gyp paramgyp)
  {
    this.a = paramgyp;
  }
  
  public final void onAnimationCancel(Animator paramAnimator) {}
  
  public final void onAnimationEnd(Animator paramAnimator) {}
  
  public final void onAnimationRepeat(Animator paramAnimator) {}
  
  public final void onAnimationStart(Animator paramAnimator)
  {
    gyo localgyo = this.b;
    gyp localgyp = this.a;
    for (;;)
    {
      int j;
      Object localObject;
      Property[] arrayOfProperty;
      String[] arrayOfString;
      try
      {
        JSONArray localJSONArray = localgyp.c.getJSONArray("animations");
        int i = localJSONArray.length();
        j = 0;
        if (j >= i) {
          break;
        }
        JSONObject localJSONObject1 = localJSONArray.getJSONObject(j);
        localObject = localgyp.d.get(localJSONObject1.getString("id"));
        if ((localObject == null) || (!localJSONObject1.has("initialValues"))) {
          break label305;
        }
        JSONObject localJSONObject2 = localJSONObject1.getJSONObject("initialValues");
        Iterator localIterator = localJSONObject2.keys();
        if (!localIterator.hasNext()) {
          break label305;
        }
        String str = (String)localIterator.next();
        if (!localgyo.d.containsKey(str)) {
          continue;
        }
        arrayOfProperty = (Property[])localgyo.c.get(str);
        arrayOfString = (String[])localgyo.d.get(str);
        if ((arrayOfString == null) && (localgyp.a(arrayOfProperty[0])))
        {
          arrayOfProperty[0].set(localObject, Float.valueOf(gyo.a(localgyp, arrayOfProperty[0], localJSONObject2.getDouble(str))));
          continue;
        }
        localJSONObject3 = localJSONObject2.getJSONObject(str);
      }
      catch (JSONException localJSONException)
      {
        throw new bm(localJSONException);
      }
      JSONObject localJSONObject3;
      for (int k = 0; k < arrayOfString.length; k++) {
        if ((localgyp.a(arrayOfProperty[k])) && (localJSONObject3.has(arrayOfString[k]))) {
          arrayOfProperty[k].set(localObject, Float.valueOf(gyo.a(localgyp, arrayOfProperty[k], localJSONObject3.getDouble(arrayOfString[k]))));
        }
      }
      continue;
      label305:
      j++;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gyq
 * JD-Core Version:    0.7.0.1
 */