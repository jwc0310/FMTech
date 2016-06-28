import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.EllipsizeCallback;
import android.text.TextUtils.TruncateAt;
import android.util.Pair;
import java.util.ArrayList;

public class lwj
{
  static final ArrayList<Pair<TextPaint, Integer>> a = new ArrayList();
  private static ContentObserver c;
  private static float d = 0.0F;
  private static ThreadLocal<SpannableStringBuilder> f = new lwk();
  public lwm b = new lwm(this);
  private final Context e;
  
  public lwj(Context paramContext)
  {
    this.e = paramContext;
    Resources localResources = paramContext.getResources();
    if (c == null)
    {
      c = new lwl(this, efj.m(), localResources);
      paramContext.getContentResolver().registerContentObserver(Settings.System.getUriFor("font_scale"), false, c);
    }
    if (Build.VERSION.SDK_INT >= 17) {
      d = localResources.getDimension(efj.Zt);
    }
  }
  
  public static int a(TextPaint paramTextPaint)
  {
    return (int)Math.ceil(paramTextPaint.descent() - paramTextPaint.ascent());
  }
  
  public static int a(TextPaint paramTextPaint, String paramString)
  {
    if (paramString == null) {
      return 0;
    }
    return 1 + (int)(paramTextPaint.measureText(paramString) + d);
  }
  
  public static void a(Spanned paramSpanned, int paramInt, SpannableStringBuilder paramSpannableStringBuilder, lwm paramlwm)
  {
    paramSpannableStringBuilder.clearSpans();
    if (paramlwm.a > 0) {}
    for (int i = paramInt + paramlwm.a;; i = paramSpannableStringBuilder.length())
    {
      TextUtils.copySpansFrom(paramSpanned, 0, i, Object.class, paramSpannableStringBuilder, 0);
      paramlwm.D_();
      return;
    }
  }
  
  public static void a(TextPaint paramTextPaint, int paramInt)
  {
    a.add(new Pair(paramTextPaint, Integer.valueOf(paramInt)));
  }
  
  public static CharSequence b(CharSequence paramCharSequence, TextPaint paramTextPaint, int paramInt, TextUtils.TruncateAt paramTruncateAt, TextUtils.EllipsizeCallback paramEllipsizeCallback)
  {
    return TextUtils.ellipsize(paramCharSequence, paramTextPaint, Math.max(0.0F, paramInt - d), paramTruncateAt, false, paramEllipsizeCallback);
  }
  
  public final StaticLayout a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Bitmap paramBitmap, Rect paramRect, int paramInt5, CharSequence paramCharSequence, Point paramPoint, TextPaint paramTextPaint, boolean paramBoolean)
  {
    return a(paramInt1, paramInt2, paramInt3, 0, paramBitmap, paramRect, paramInt5, paramCharSequence, paramPoint, paramTextPaint, paramBoolean, 1, false, null);
  }
  
  public final StaticLayout a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Bitmap paramBitmap, Rect paramRect, int paramInt5, CharSequence paramCharSequence, Point paramPoint, TextPaint paramTextPaint, boolean paramBoolean1, int paramInt6, boolean paramBoolean2, lxx paramlxx)
  {
    paramPoint.set(paramInt1, paramInt2);
    if (paramBitmap != null)
    {
      int i1 = paramInt5 + paramBitmap.getWidth();
      paramInt3 -= i1;
      paramRect.set(paramInt1, paramInt2, paramInt1 + paramBitmap.getWidth(), paramInt2 + paramBitmap.getHeight());
      paramPoint.set(i1 + paramPoint.x, paramPoint.y);
    }
    int i = Math.max(paramInt3, 0);
    if (i <= 0) {}
    for (Object localObject1 = "";; localObject1 = paramCharSequence)
    {
      Object localObject2;
      int j;
      if (paramBoolean2) {
        if (paramBoolean1)
        {
          localObject2 = lww.a(this.e, paramTextPaint, (CharSequence)localObject1, i, paramInt6, 1.0F, null);
          j = Math.max(paramInt4, ((StaticLayout)localObject2).getHeight());
          if (paramBitmap == null) {
            break label283;
          }
        }
      }
      label283:
      for (int k = paramBitmap.getHeight();; k = 0)
      {
        int m = Math.max(j, k);
        if (paramBitmap != null) {
          paramRect.offset(0, Math.abs(m - paramBitmap.getHeight()) / 2);
        }
        int n = Math.abs(m - ((StaticLayout)localObject2).getHeight()) / 2;
        paramPoint.set(paramPoint.x, n + paramPoint.y);
        return localObject2;
        Layout.Alignment localAlignment2 = Layout.Alignment.ALIGN_NORMAL;
        localObject2 = new lww((CharSequence)localObject1, paramTextPaint, i, localAlignment2, 1.0F, 0.0F, false, null);
        break;
        if (paramBoolean1)
        {
          localObject2 = a(paramTextPaint, (CharSequence)localObject1, i, paramInt6);
          break;
        }
        Layout.Alignment localAlignment1 = Layout.Alignment.ALIGN_NORMAL;
        localObject2 = new StaticLayout((CharSequence)localObject1, paramTextPaint, i, localAlignment1, 1.0F, 0.0F, false);
        break;
      }
    }
  }
  
  public final StaticLayout a(TextPaint paramTextPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    Layout.Alignment localAlignment = Layout.Alignment.ALIGN_NORMAL;
    TextUtils.TruncateAt localTruncateAt = TextUtils.TruncateAt.END;
    int i = Math.max(paramInt1, 0);
    Object localObject;
    StaticLayout localStaticLayout;
    if (paramInt2 == 0)
    {
      localObject = "";
      localStaticLayout = new StaticLayout((CharSequence)localObject, paramTextPaint, i, localAlignment, 1.0F, 0.0F, false);
    }
    do
    {
      return localStaticLayout;
      if (paramInt2 == 1)
      {
        localObject = a(paramCharSequence, paramTextPaint, i, localTruncateAt, null);
        break;
      }
      localStaticLayout = new StaticLayout(paramCharSequence, paramTextPaint, i, localAlignment, 1.0F, 0.0F, false);
    } while (localStaticLayout.getLineCount() <= paramInt2);
    int j = localStaticLayout.getLineEnd(paramInt2 - 2);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(paramCharSequence.subSequence(0, j));
    boolean bool = paramCharSequence instanceof Spanned;
    if (bool) {
      efj.k();
    }
    for (lwm locallwm = this.b;; locallwm = null)
    {
      localSpannableStringBuilder.append(a(paramCharSequence.subSequence(j, paramCharSequence.length()), paramTextPaint, i, localTruncateAt, locallwm));
      if (bool) {
        a((Spanned)paramCharSequence, j, localSpannableStringBuilder, locallwm);
      }
      localObject = localSpannableStringBuilder;
      break;
    }
  }
  
  public final CharSequence a(CharSequence paramCharSequence, TextPaint paramTextPaint, int paramInt, TextUtils.TruncateAt paramTruncateAt, TextUtils.EllipsizeCallback paramEllipsizeCallback)
  {
    CharSequence localCharSequence = b(paramCharSequence, paramTextPaint, paramInt, paramTruncateAt, paramEllipsizeCallback);
    String str = localCharSequence.toString();
    int i = str.indexOf('\r');
    int j = str.indexOf('\n');
    if ((i == -1) && (j == -1)) {
      return localCharSequence;
    }
    SpannableStringBuilder localSpannableStringBuilder = (SpannableStringBuilder)f.get();
    localSpannableStringBuilder.clear();
    if ((i != -1) && (j != -1)) {
      i = Math.min(i, j);
    }
    for (;;)
    {
      localSpannableStringBuilder.append(localCharSequence.subSequence(0, i));
      localSpannableStringBuilder.append('…');
      if (paramEllipsizeCallback != null) {
        paramEllipsizeCallback.ellipsized(i, paramCharSequence.length());
      }
      return localSpannableStringBuilder.toString();
      if (i == -1) {
        i = j;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lwj
 * JD-Core Version:    0.7.0.1
 */