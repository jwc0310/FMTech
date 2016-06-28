import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
public final class gyo
{
  public static gyo a;
  SparseArray<JSONObject> b = new SparseArray();
  Map<String, Property<?, ?>[]> c = new HashMap();
  Map<String, String[]> d = new HashMap();
  
  public gyo()
  {
    Map localMap1 = this.c;
    Property[] arrayOfProperty1 = new Property[2];
    arrayOfProperty1[0] = gyt.a;
    arrayOfProperty1[1] = gyt.b;
    localMap1.put("position", arrayOfProperty1);
    this.d.put("position", new String[] { "x", "y" });
    Map localMap2 = this.c;
    Property[] arrayOfProperty2 = new Property[2];
    arrayOfProperty2[0] = View.SCALE_X;
    arrayOfProperty2[1] = View.SCALE_Y;
    localMap2.put("scale", arrayOfProperty2);
    this.d.put("scale", new String[] { "sx", "sy" });
    Map localMap3 = this.c;
    Property[] arrayOfProperty3 = new Property[1];
    arrayOfProperty3[0] = View.ALPHA;
    localMap3.put("opacity", arrayOfProperty3);
    this.d.put("opacity", null);
  }
  
  static float a(gyp paramgyp, Property<?, ?> paramProperty, double paramDouble)
  {
    if (!paramgyp.a(paramProperty)) {
      throw new bm("Cannot animate position if stage size was not defined");
    }
    float f = 1.0F;
    if (paramProperty == gyt.a) {
      f = paramgyp.a;
    }
    for (;;)
    {
      return f * (float)paramDouble;
      if (paramProperty == gyt.b) {
        f = paramgyp.b;
      }
    }
  }
  
  static String a(Context paramContext, int paramInt)
  {
    InputStream localInputStream = null;
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localInputStream = paramContext.getResources().openRawResource(paramInt);
      BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(localInputStream));
      for (;;)
      {
        String str1 = localBufferedReader.readLine();
        if (str1 == null) {
          break;
        }
        localStringBuilder.append(str1);
      }
      str2 = localStringBuilder.toString();
    }
    finally
    {
      if (localInputStream != null) {
        localInputStream.close();
      }
    }
    String str2;
    if (localInputStream != null) {
      localInputStream.close();
    }
    return str2;
  }
  
  private final Collection<Animator> a(gyp paramgyp)
  {
    JSONArray localJSONArray = paramgyp.c.getJSONArray("animations");
    ArrayList localArrayList = new ArrayList();
    int i = localJSONArray.length();
    for (int j = 0; j < i; j++) {
      a(paramgyp, localJSONArray.getJSONObject(j), localArrayList);
    }
    return localArrayList;
  }
  
  private final void a(gyp paramgyp, JSONObject paramJSONObject, Collection<Animator> paramCollection)
  {
    Object localObject1 = paramgyp.d.get(paramJSONObject.getString("id"));
    if (localObject1 == null) {}
    label259:
    label411:
    label426:
    label432:
    for (;;)
    {
      return;
      JSONArray localJSONArray1 = paramJSONObject.getJSONArray("animations");
      int i = localJSONArray1.length();
      label176:
      label200:
      label493:
      for (int j = 0; j < i; j++)
      {
        JSONObject localJSONObject1 = localJSONArray1.getJSONObject(j);
        long l1 = (1000.0D * localJSONObject1.getDouble("duration"));
        long l2 = (1000.0D * localJSONObject1.optDouble("delay", 0.0D));
        String str = localJSONObject1.getString("property");
        Property[] arrayOfProperty = (Property[])this.c.get(str);
        String[] arrayOfString = (String[])this.d.get(str);
        int k;
        JSONArray localJSONArray2;
        int m;
        if (arrayOfString == null)
        {
          k = 1;
          localJSONArray2 = localJSONObject1.getJSONArray("keyframes");
          m = localJSONArray2.length();
          if (m <= 0) {}
        }
        else
        {
          for (int n = 0;; n++)
          {
            if (n >= arrayOfProperty.length) {
              break label493;
            }
            int i1 = 0;
            Object localObject2 = null;
            Keyframe[] arrayOfKeyframe = null;
            if (i1 < m)
            {
              JSONArray localJSONArray3 = localJSONArray2.getJSONArray(i1);
              JSONObject localJSONObject2;
              double d1;
              JSONObject localJSONObject3;
              if (k != 0)
              {
                localJSONObject2 = null;
                if ((localJSONObject2 != null) && (!localJSONObject2.has(arrayOfString[n]))) {
                  break label432;
                }
                if (arrayOfKeyframe == null) {
                  arrayOfKeyframe = new Keyframe[m];
                }
                float f = (float)localJSONArray3.getDouble(0);
                Property localProperty = arrayOfProperty[n];
                if (k == 0) {
                  break label411;
                }
                d1 = localJSONArray3.getDouble(1);
                arrayOfKeyframe[i1] = Keyframe.ofFloat(f, a(paramgyp, localProperty, d1));
                if (localObject2 != null)
                {
                  ((gys)localObject2).a(arrayOfKeyframe[(i1 - 1)], arrayOfKeyframe[i1]);
                  arrayOfKeyframe[i1].setInterpolator((TimeInterpolator)localObject2);
                }
                if (localJSONArray3.length() < 3) {
                  break label426;
                }
                localJSONObject3 = localJSONArray3.getJSONObject(2);
                if (!localJSONObject3.getString("name").equals("cubic-bezier")) {
                  break label426;
                }
              }
              for (gyr localgyr = new gyr((float)localJSONObject3.getDouble("x1"), (float)localJSONObject3.getDouble("y1"), (float)localJSONObject3.getDouble("x2"), (float)localJSONObject3.getDouble("y2"));; localgyr = null)
              {
                i1++;
                localObject2 = localgyr;
                break label176;
                k = 0;
                break;
                localJSONObject2 = localJSONArray3.getJSONObject(1);
                break label200;
                d1 = localJSONObject2.getDouble(arrayOfString[n]);
                break label259;
              }
            }
            if (arrayOfKeyframe != null)
            {
              PropertyValuesHolder[] arrayOfPropertyValuesHolder = new PropertyValuesHolder[1];
              arrayOfPropertyValuesHolder[0] = PropertyValuesHolder.ofKeyframe(arrayOfProperty[n], arrayOfKeyframe);
              ObjectAnimator localObjectAnimator = ObjectAnimator.ofPropertyValuesHolder(localObject1, arrayOfPropertyValuesHolder);
              localObjectAnimator.setDuration(l1).setStartDelay(l2);
              paramCollection.add(localObjectAnimator);
            }
          }
        }
      }
    }
  }
  
  public final Animator a(Context paramContext, int paramInt, Map<String, Object> paramMap, float paramFloat1, float paramFloat2)
  {
    try
    {
      gyp localgyp = new gyp(this, paramContext, paramInt, paramMap, -1.0F, -1.0F);
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(a(localgyp));
      localAnimatorSet.addListener(new gyq(this, localgyp));
      return localAnimatorSet;
    }
    catch (NullPointerException localNullPointerException)
    {
      throw new bm(localNullPointerException);
    }
    catch (JSONException localJSONException)
    {
      break label59;
    }
    catch (IOException localIOException)
    {
      label59:
      break label59;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gyo
 * JD-Core Version:    0.7.0.1
 */