package com.google.android.libraries.social.people.providers.search;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import az;
import com.google.android.libraries.social.people.providers.acl.PersonAvatarView;
import com.google.android.libraries.social.people.ui.PeopleListRowNameView;
import efj;
import java.util.List;
import jgw;
import jjf;
import jjg;
import jnx;

public final class PersonSearchRowView
  extends RelativeLayout
{
  private PersonAvatarView a;
  private ImageView b;
  private PeopleListRowNameView c;
  
  public PersonSearchRowView(Context paramContext)
  {
    super(paramContext);
  }
  
  public PersonSearchRowView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public PersonSearchRowView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void a(jjg paramjjg)
  {
    int i = 1;
    jjf localjjf = new jjf(paramjjg.a());
    if (localjjf.b)
    {
      this.a.setVisibility(0);
      this.b.setVisibility(8);
      this.a.a(paramjjg);
      if (!(paramjjg instanceof jnx)) {
        break label251;
      }
    }
    label106:
    label244:
    label251:
    for (String str1 = ((jnx)paramjjg).c;; str1 = null)
    {
      List localList = paramjjg.i();
      int j = localList.size();
      String str2;
      if (j == i) {
        str2 = ((jgw)localList.get(0)).c();
      }
      for (;;)
      {
        String str3 = paramjjg.d();
        boolean bool = paramjjg.m();
        if (paramjjg.k() == 2) {}
        for (;;)
        {
          this.c.a(str3, bool, str2, null, false, i);
          return;
          if (!localjjf.a) {
            break;
          }
          this.a.setVisibility(8);
          this.b.setVisibility(0);
          this.b.setImageDrawable(getResources().getDrawable(efj.SJ));
          break;
          if (j <= i) {
            break label244;
          }
          Resources localResources = getResources();
          int k = efj.SM;
          Object[] arrayOfObject = new Object[i];
          arrayOfObject[0] = Integer.valueOf(j);
          str2 = localResources.getString(k, arrayOfObject);
          break label106;
          i = 0;
        }
        str2 = str1;
      }
    }
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((PersonAvatarView)findViewById(az.o));
    this.b = ((ImageView)findViewById(az.q));
    this.c = ((PeopleListRowNameView)findViewById(az.r));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.people.providers.search.PersonSearchRowView
 * JD-Core Version:    0.7.0.1
 */