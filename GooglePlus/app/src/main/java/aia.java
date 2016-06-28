import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

public final class aia
  extends so
  implements View.OnClickListener
{
  private ColorStateList f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  
  private final Drawable a(ComponentName paramComponentName)
  {
    PackageManager localPackageManager = this.d.getPackageManager();
    ActivityInfo localActivityInfo;
    int m;
    try
    {
      localActivityInfo = localPackageManager.getActivityInfo(paramComponentName, 128);
      m = localActivityInfo.getIconResource();
      if (m == 0) {
        return null;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      localNameNotFoundException.toString();
      return null;
    }
    Drawable localDrawable = localPackageManager.getDrawable(paramComponentName.getPackageName(), m, localActivityInfo.applicationInfo);
    if (localDrawable == null)
    {
      new StringBuilder("Invalid icon resource ").append(m).append(" for ").append(paramComponentName.flattenToShortString());
      return null;
    }
    return localDrawable;
  }
  
  private final Drawable a(Uri paramUri)
  {
    try
    {
      boolean bool = "android.resource".equals(paramUri.getScheme());
      if (bool) {
        try
        {
          Drawable localDrawable2 = b(paramUri);
          return localDrawable2;
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          throw new FileNotFoundException("Resource does not exist: " + paramUri);
        }
      }
      localInputStream = null.getContentResolver().openInputStream(paramUri);
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      new StringBuilder("Icon not found: ").append(paramUri).append(", ").append(localFileNotFoundException.getMessage());
      return null;
    }
    if (localInputStream == null) {
      throw new FileNotFoundException("Failed to open " + paramUri);
    }
    try
    {
      Drawable localDrawable1 = Drawable.createFromStream(localInputStream, null);
      try
      {
        localInputStream.close();
        return localDrawable1;
      }
      catch (IOException localIOException2)
      {
        Log.e("SuggestionsAdapter", "Error closing icon stream for " + paramUri, localIOException2);
        return localDrawable1;
      }
      try
      {
        localInputStream.close();
        throw localObject;
      }
      catch (IOException localIOException1)
      {
        for (;;)
        {
          Log.e("SuggestionsAdapter", "Error closing icon stream for " + paramUri, localIOException1);
        }
      }
    }
    finally {}
  }
  
  private final Drawable a(String paramString)
  {
    Drawable localDrawable;
    if ((paramString == null) || (paramString.length() == 0) || ("0".equals(paramString))) {
      localDrawable = null;
    }
    for (;;)
    {
      return localDrawable;
      try
      {
        int m = Integer.parseInt(paramString);
        String str = "android.resource://" + null.getPackageName() + "/" + m;
        localDrawable = b(str);
        if (localDrawable == null)
        {
          localDrawable = fo.a(null, m);
          if (localDrawable != null)
          {
            null.put(str, localDrawable.getConstantState());
            return localDrawable;
          }
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localDrawable = b(paramString);
        if (localDrawable == null)
        {
          localDrawable = a(Uri.parse(paramString));
          if (localDrawable != null)
          {
            null.put(paramString, localDrawable.getConstantState());
            return localDrawable;
          }
        }
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        new StringBuilder("Icon resource not found: ").append(paramString);
      }
    }
    return null;
  }
  
  public static String a(Cursor paramCursor, int paramInt)
  {
    if (paramInt == -1) {
      return null;
    }
    try
    {
      String str = paramCursor.getString(paramInt);
      return str;
    }
    catch (Exception localException)
    {
      Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", localException);
    }
    return null;
  }
  
  private static void a(ImageView paramImageView, Drawable paramDrawable, int paramInt)
  {
    paramImageView.setImageDrawable(paramDrawable);
    if (paramDrawable == null)
    {
      paramImageView.setVisibility(paramInt);
      return;
    }
    paramImageView.setVisibility(0);
    paramDrawable.setVisible(false, false);
    paramDrawable.setVisible(true, false);
  }
  
  private static void a(TextView paramTextView, CharSequence paramCharSequence)
  {
    paramTextView.setText(paramCharSequence);
    if (TextUtils.isEmpty(paramCharSequence))
    {
      paramTextView.setVisibility(8);
      return;
    }
    paramTextView.setVisibility(0);
  }
  
  private Drawable b(Uri paramUri)
  {
    String str = paramUri.getAuthority();
    if (TextUtils.isEmpty(str)) {
      throw new FileNotFoundException("No authority: " + paramUri);
    }
    Resources localResources;
    List localList;
    try
    {
      localResources = this.d.getPackageManager().getResourcesForApplication(str);
      localList = paramUri.getPathSegments();
      if (localList == null) {
        throw new FileNotFoundException("No path: " + paramUri);
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new FileNotFoundException("No package found for authority: " + paramUri);
    }
    int m = localList.size();
    if (m == 1) {}
    int n;
    for (;;)
    {
      try
      {
        int i1 = Integer.parseInt((String)localList.get(0));
        n = i1;
        if (n != 0) {
          break;
        }
        throw new FileNotFoundException("No resource found for: " + paramUri);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new FileNotFoundException("Single path segment is not a resource ID: " + paramUri);
      }
      if (m == 2) {
        n = localResources.getIdentifier((String)localList.get(1), (String)localList.get(0), str);
      } else {
        throw new FileNotFoundException("More than two path segments: " + paramUri);
      }
    }
    return localResources.getDrawable(n);
  }
  
  private final Drawable b(String paramString)
  {
    Drawable.ConstantState localConstantState = (Drawable.ConstantState)null.get(paramString);
    if (localConstantState == null) {
      return null;
    }
    return localConstantState.newDrawable();
  }
  
  private static void d(Cursor paramCursor)
  {
    if (paramCursor != null) {}
    for (Bundle localBundle = paramCursor.getExtras();; localBundle = null)
    {
      if ((localBundle != null) && (localBundle.getBoolean("in_progress"))) {}
      return;
    }
  }
  
  public final Cursor a(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {}
    for (String str1 = ""; (null.getVisibility() != 0) || (null.getWindowVisibility() != 0); str1 = paramCharSequence.toString()) {
      return null;
    }
    Cursor localCursor;
    if (0 == 0) {
      localCursor = null;
    }
    for (;;)
    {
      if (localCursor != null)
      {
        try
        {
          localCursor.getCount();
          return localCursor;
        }
        catch (RuntimeException localRuntimeException) {}
        String str2 = null.getSuggestAuthority();
        if (str2 == null)
        {
          localCursor = null;
        }
        else
        {
          Uri.Builder localBuilder = new Uri.Builder().scheme("content").authority(str2).query("").fragment("");
          String str3 = null.getSuggestPath();
          if (str3 != null) {
            localBuilder.appendEncodedPath(str3);
          }
          localBuilder.appendPath("search_suggest_query");
          String str4 = null.getSuggestSelection();
          if (str4 != null) {}
          for (String[] arrayOfString = { str1 };; arrayOfString = null)
          {
            localBuilder.appendQueryParameter("limit", "50");
            Uri localUri = localBuilder.build();
            localCursor = this.d.getContentResolver().query(localUri, null, str4, arrayOfString, null);
            break;
            localBuilder.appendPath(str1);
          }
        }
      }
    }
    return null;
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = super.a(paramContext, paramCursor, paramViewGroup);
    localView.setTag(new aib(localView));
    ((ImageView)localView.findViewById(efj.as)).setImageResource(0);
    return localView;
  }
  
  public final void a(Cursor paramCursor)
  {
    try
    {
      super.a(paramCursor);
      if (paramCursor != null)
      {
        this.g = paramCursor.getColumnIndex("suggest_text_1");
        this.h = paramCursor.getColumnIndex("suggest_text_2");
        this.i = paramCursor.getColumnIndex("suggest_text_2_url");
        this.j = paramCursor.getColumnIndex("suggest_icon_1");
        this.k = paramCursor.getColumnIndex("suggest_icon_2");
        this.l = paramCursor.getColumnIndex("suggest_flags");
      }
      return;
    }
    catch (Exception localException)
    {
      Log.e("SuggestionsAdapter", "error changing cursor and caching columns", localException);
    }
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    aib localaib = (aib)paramView.getTag();
    if (this.l != -1) {
      paramCursor.getInt(this.l);
    }
    if (localaib.a != null)
    {
      String str3 = a(paramCursor, this.g);
      a(localaib.a, str3);
    }
    Object localObject3;
    label210:
    Object localObject1;
    label246:
    ImageView localImageView1;
    Drawable localDrawable1;
    if (localaib.b != null)
    {
      String str2 = a(paramCursor, this.i);
      if (str2 != null)
      {
        if (this.f == null)
        {
          TypedValue localTypedValue = new TypedValue();
          this.d.getTheme().resolveAttribute(aau.ad, localTypedValue, true);
          this.f = this.d.getResources().getColorStateList(localTypedValue.resourceId);
        }
        SpannableString localSpannableString = new SpannableString(str2);
        localSpannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f, null), 0, str2.length(), 33);
        localObject3 = localSpannableString;
        if (!TextUtils.isEmpty((CharSequence)localObject3)) {
          break label317;
        }
        if (localaib.a != null)
        {
          localaib.a.setSingleLine(false);
          localaib.a.setMaxLines(2);
        }
        a(localaib.b, (CharSequence)localObject3);
      }
    }
    else
    {
      if (localaib.c != null)
      {
        ImageView localImageView2 = localaib.c;
        if (this.j != -1) {
          break label346;
        }
        localObject1 = null;
        a(localImageView2, (Drawable)localObject1, 4);
      }
      if (localaib.d != null)
      {
        localImageView1 = localaib.d;
        int m = this.k;
        localDrawable1 = null;
        if (m != -1) {
          break label484;
        }
      }
    }
    for (;;)
    {
      a(localImageView1, localDrawable1, 8);
      localaib.e.setVisibility(8);
      return;
      localObject3 = a(paramCursor, this.h);
      break;
      label317:
      if (localaib.a == null) {
        break label210;
      }
      localaib.a.setSingleLine(true);
      localaib.a.setMaxLines(1);
      break label210;
      label346:
      localObject1 = a(paramCursor.getString(this.j));
      if (localObject1 != null) {
        break label246;
      }
      ComponentName localComponentName = null.getSearchActivity();
      String str1 = localComponentName.flattenToShortString();
      if (null.containsKey(str1))
      {
        Drawable.ConstantState localConstantState = (Drawable.ConstantState)null.get(str1);
        if (localConstantState == null) {}
        for (localObject1 = null;; localObject1 = localConstantState.newDrawable(null.getResources()))
        {
          label408:
          if (localObject1 != null) {
            break label472;
          }
          localObject1 = this.d.getPackageManager().getDefaultActivityIcon();
          break;
        }
      }
      Drawable localDrawable2 = a(localComponentName);
      if (localDrawable2 == null) {}
      for (Object localObject2 = null;; localObject2 = localDrawable2.getConstantState())
      {
        null.put(str1, localObject2);
        localObject1 = localDrawable2;
        break label408;
        label472:
        break;
      }
      label484:
      localDrawable1 = a(paramCursor.getString(this.k));
    }
  }
  
  public final CharSequence c(Cursor paramCursor)
  {
    if (paramCursor == null) {}
    String str2;
    do
    {
      do
      {
        return null;
        String str1 = a(paramCursor, paramCursor.getColumnIndex("suggest_intent_query"));
        if (str1 != null) {
          return str1;
        }
        if (null.shouldRewriteQueryFromData())
        {
          String str3 = a(paramCursor, paramCursor.getColumnIndex("suggest_intent_data"));
          if (str3 != null) {
            return str3;
          }
        }
      } while (!null.shouldRewriteQueryFromText());
      str2 = a(paramCursor, paramCursor.getColumnIndex("suggest_text_1"));
    } while (str2 == null);
    return str2;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    try
    {
      View localView2 = super.getView(paramInt, paramView, paramViewGroup);
      return localView2;
    }
    catch (RuntimeException localRuntimeException)
    {
      View localView1 = a(this.d, this.c, paramViewGroup);
      if (localView1 != null) {
        ((aib)localView1.getTag()).a.setText(localRuntimeException.toString());
      }
      return localView1;
    }
  }
  
  public final boolean hasStableIds()
  {
    return false;
  }
  
  public final void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    d(this.c);
  }
  
  public final void notifyDataSetInvalidated()
  {
    super.notifyDataSetInvalidated();
    d(this.c);
  }
  
  public final void onClick(View paramView)
  {
    Object localObject = paramView.getTag();
    if ((localObject instanceof CharSequence)) {
      null.a((CharSequence)localObject);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aia
 * JD-Core Version:    0.7.0.1
 */