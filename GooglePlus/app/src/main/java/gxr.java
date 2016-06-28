import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class gxr
  implements Serializable
{
  public static final String a = gxr.class.getName();
  private static final long serialVersionUID = 1L;
  public final List<gxq> b = new ArrayList();
  
  private final void b(View paramView)
  {
    if ((paramView instanceof gxs)) {}
    for (gxq localgxq = ((gxs)paramView).v();; localgxq = efj.h(paramView))
    {
      if (localgxq != null) {
        this.b.add(localgxq);
      }
      return;
    }
  }
  
  public final gxr a(Context paramContext)
  {
    mbb localmbb = mbb.b(paramContext);
    List localList = localmbb.d(gxs.class);
    for (int i = 0; i < localList.size(); i++)
    {
      gxq localgxq2 = ((gxs)localList.get(i)).v();
      this.b.add(localgxq2);
    }
    if ((this.b.isEmpty()) || (!((gxq)this.b.get(-1 + this.b.size())).a.b))
    {
      gxp localgxp = (gxp)localmbb.b(gxp.class);
      if (localgxp != null)
      {
        gxq localgxq1 = localgxp.v();
        if (localgxq1 != null)
        {
          this.b.add(localgxq1);
          if (Log.isLoggable("VisualElementPath", 3))
          {
            Locale localLocale = Locale.US;
            Object[] arrayOfObject = new Object[2];
            arrayOfObject[0] = localgxq1;
            arrayOfObject[1] = toString();
            String.format(localLocale, "Found VE: %s resulting path: %s", arrayOfObject);
          }
        }
      }
    }
    Context localContext = paramContext;
    if (((localContext instanceof ContextWrapper)) || ((localContext instanceof Activity))) {
      if (!(localContext instanceof Activity)) {}
    }
    for (Intent localIntent = ((Activity)localContext).getIntent();; localIntent = null)
    {
      if (localIntent != null)
      {
        gxr localgxr = (gxr)localIntent.getSerializableExtra(a);
        if (localgxr != null) {
          this.b.addAll(localgxr.b);
        }
      }
      return this;
      localContext = ((ContextWrapper)localContext).getBaseContext();
      break;
    }
  }
  
  public final gxr a(View paramView)
  {
    b(paramView);
    for (ViewParent localViewParent = paramView.getParent(); localViewParent != null; localViewParent = localViewParent.getParent()) {
      if ((localViewParent instanceof View)) {
        b((View)localViewParent);
      }
    }
    a(paramView.getContext());
    return this;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof gxr)) {
      return false;
    }
    return efj.c(((gxr)paramObject).b, this.b);
  }
  
  public final int hashCode()
  {
    return this.b.hashCode();
  }
  
  public final String toString()
  {
    List localList = this.b;
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < localList.size(); i++)
    {
      if (i > 0) {
        localStringBuilder.append("->");
      }
      localStringBuilder.append(((gxq)localList.get(i)).a.a);
    }
    return " (leaf->root)";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gxr
 * JD-Core Version:    0.7.0.1
 */