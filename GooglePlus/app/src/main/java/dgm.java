import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.apps.plus.search.views.UnifiedSearchHeaderV2;
import com.google.android.apps.plus.views.UnifiedSearchHeader;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;
import com.google.android.libraries.social.spaces.SpaceListItemView;
import com.google.android.libraries.social.stream.legacy.views.StreamGridView;
import com.google.android.libraries.social.ui.tabbar.TabBar;
import java.util.ArrayList;

public final class dgm
  extends dfz
{
  public static final String[] a = { "_id", "gaia_id", "person_id", "name", "avatar", "profile_type", "snippet", "in_same_visibility_group", "verified", "auto_complete_index", "auto_complete_suggestion" };
  public static final String[] b = { "_id", "person_id", "gaia_id", "name", "avatar", "packed_circle_ids", "email", "profile_type", "in_same_visibility_group", "verified", "interaction_sort_key" };
  public static final String[] c = { "square_id", "square_name", "photo_url", "post_visibility", "member_count", "membership_status", "unread_count", "inviter_gaia_id", "inviter_name", "inviter_photo_url", "invitation_dismissed", "is_member", "list_category", "suggestion_id", "restricted_domain", "joinability" };
  public static final String[] d = { "_id", "cxn_id", "cxn_name", "owner_gaia_id", "owner_display_name", "owner_photo_url", "nickname", "cover_photo_url", "domain_name", "tagline", "suggestion_id" };
  public static final String[] e = { "follow_state", "sync_timestamp", "color", "follow_count", "post_count", "visibility_type", "last_used_timestamp", "sharing_target_group_type", "subscribe_state", "auto_follow_state" };
  public static final String[] f = { "abuse_info", "sharing_roster" };
  public nzp[] g;
  public Cursor h;
  public Cursor i;
  public djw j;
  public String k;
  public String l;
  public String m;
  public String n;
  public int o;
  private Cursor p;
  private ArrayList q;
  private boolean r;
  private boolean s;
  
  public dgm(Context paramContext, StreamGridView paramStreamGridView, hfa paramhfa, int paramInt, dat paramdat, dge paramdge, lob paramlob)
  {
    super(paramContext, paramStreamGridView, paramhfa, paramInt, paramdat, paramdge, null, paramlob);
    b(x());
    this.r = ((djp)mbb.a(paramContext, djp.class)).a(paramInt);
  }
  
  private static SpannableStringBuilder a(qoq paramqoq)
  {
    return efj.a(paramqoq, new dgn(), efj.f(), efj.e());
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    if (this.r) {}
    for (View localView = View.inflate(paramContext, efj.wE, null);; localView = View.inflate(paramContext, efj.wD, null))
    {
      lpt locallpt = new lpt(-2);
      locallpt.a = this.ay.a;
      locallpt.setMargins(-this.ay.f, -this.ay.d, -this.ay.f, 0);
      localView.setLayoutParams(locallpt);
      return localView;
    }
  }
  
  public final void a(View paramView, Cursor paramCursor)
  {
    int i1 = 1;
    int i2 = 0;
    int i22;
    nzp localnzp;
    SpannableStringBuilder localSpannableStringBuilder;
    if (this.g != null)
    {
      nzp[] arrayOfnzp = this.g;
      int i21 = arrayOfnzp.length;
      i22 = 0;
      if (i22 < i21)
      {
        localnzp = arrayOfnzp[i22];
        if (localnzp.a == i1) {
          localSpannableStringBuilder = a(localnzp.b.a);
        }
      }
    }
    for (;;)
    {
      label62:
      if (this.r)
      {
        UnifiedSearchHeaderV2 localUnifiedSearchHeaderV2 = (UnifiedSearchHeaderV2)paramView;
        localUnifiedSearchHeaderV2.q = (this.ay.a() / (localUnifiedSearchHeaderV2.n + localUnifiedSearchHeaderV2.o));
        localUnifiedSearchHeaderV2.r = localUnifiedSearchHeaderV2.q;
        localUnifiedSearchHeaderV2.c.removeAllViews();
        int i13 = 0;
        label120:
        if (i13 < localUnifiedSearchHeaderV2.r)
        {
          SpaceListItemView localSpaceListItemView2 = localUnifiedSearchHeaderV2.a.b(localUnifiedSearchHeaderV2.getContext(), localUnifiedSearchHeaderV2.c);
          localSpaceListItemView2.setVisibility(8);
          LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2, 1.0F);
          localLayoutParams2.setMargins(localUnifiedSearchHeaderV2.o, localUnifiedSearchHeaderV2.o, localUnifiedSearchHeaderV2.o, localUnifiedSearchHeaderV2.o);
          localSpaceListItemView2.setLayoutParams(localLayoutParams2);
          if (Build.VERSION.SDK_INT >= 21) {}
          int i20;
          for (int i19 = i1;; i20 = 0)
          {
            if (i19 != 0) {
              localSpaceListItemView2.setElevation(localUnifiedSearchHeaderV2.p);
            }
            localUnifiedSearchHeaderV2.c.addView(localSpaceListItemView2);
            i13++;
            break label120;
            if (localnzp.a == 2)
            {
              localSpannableStringBuilder = a(localnzp.c.a);
              break label62;
            }
            i22++;
            break;
          }
        }
        localUnifiedSearchHeaderV2.g.setVisibility(8);
        localUnifiedSearchHeaderV2.c.setVisibility(8);
        localUnifiedSearchHeaderV2.d.removeAllViews();
        int i14 = 0;
        if (i14 < localUnifiedSearchHeaderV2.q)
        {
          SpaceListItemView localSpaceListItemView1 = localUnifiedSearchHeaderV2.a.b(localUnifiedSearchHeaderV2.getContext(), localUnifiedSearchHeaderV2.d);
          localSpaceListItemView1.setVisibility(8);
          LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-2, -2, 1.0F);
          localLayoutParams1.setMargins(localUnifiedSearchHeaderV2.o, localUnifiedSearchHeaderV2.o, localUnifiedSearchHeaderV2.o, localUnifiedSearchHeaderV2.o);
          localSpaceListItemView1.setLayoutParams(localLayoutParams1);
          if (Build.VERSION.SDK_INT >= 21) {}
          int i18;
          for (int i17 = i1;; i18 = 0)
          {
            if (i17 != 0) {
              localSpaceListItemView1.setElevation(localUnifiedSearchHeaderV2.p);
            }
            localUnifiedSearchHeaderV2.d.addView(localSpaceListItemView1);
            i14++;
            break;
          }
        }
        localUnifiedSearchHeaderV2.h.setVisibility(8);
        localUnifiedSearchHeaderV2.d.setVisibility(8);
        localUnifiedSearchHeaderV2.e.removeAllViews();
        for (int i15 = 0; i15 < 3; i15++)
        {
          PeopleListRowView localPeopleListRowView = (PeopleListRowView)localUnifiedSearchHeaderV2.s.inflate(aau.xh, null);
          localPeopleListRowView.a(localUnifiedSearchHeaderV2.b, null, i1);
          localPeopleListRowView.k = i1;
          localPeopleListRowView.a(i1);
          localPeopleListRowView.setVisibility(8);
          localUnifiedSearchHeaderV2.e.addView(localPeopleListRowView);
        }
        localUnifiedSearchHeaderV2.i.setVisibility(8);
        localUnifiedSearchHeaderV2.e.setVisibility(8);
        localUnifiedSearchHeaderV2.t = this.j;
        label635:
        TextView localTextView;
        label707:
        int i16;
        if (TextUtils.isEmpty(localSpannableStringBuilder))
        {
          localUnifiedSearchHeaderV2.m.setVisibility(8);
          if ((this.h == null) || (this.h.getCount() <= 0)) {
            break label785;
          }
          localUnifiedSearchHeaderV2.j = this.k;
          localUnifiedSearchHeaderV2.b(this.h);
          if ((this.i == null) || (this.i.getCount() <= 0)) {
            break label794;
          }
          localUnifiedSearchHeaderV2.k = this.l;
          localUnifiedSearchHeaderV2.c(this.i);
          if ((this.q == null) || (this.q.size() <= 0)) {
            break label803;
          }
          localUnifiedSearchHeaderV2.l = this.m;
          localUnifiedSearchHeaderV2.a(this.q);
          boolean bool = this.s;
          localTextView = localUnifiedSearchHeaderV2.f;
          i16 = 0;
          if (!bool) {
            break label858;
          }
        }
        for (;;)
        {
          localTextView.setVisibility(i16);
          String str = this.n;
          localUnifiedSearchHeaderV2.f.setText(str);
          return;
          localUnifiedSearchHeaderV2.m.setText(localSpannableStringBuilder);
          localUnifiedSearchHeaderV2.m.setVisibility(0);
          localUnifiedSearchHeaderV2.m.setMovementMethod(LinkMovementMethod.getInstance());
          break;
          localUnifiedSearchHeaderV2.b(null);
          break label635;
          localUnifiedSearchHeaderV2.c(null);
          break label672;
          if ((this.p != null) && (this.p.getCount() > 0))
          {
            localUnifiedSearchHeaderV2.l = this.m;
            localUnifiedSearchHeaderV2.a(this.p);
            break label707;
          }
          localUnifiedSearchHeaderV2.a(null);
          localUnifiedSearchHeaderV2.a(null);
          break label707;
          label858:
          i16 = 8;
        }
      }
      label672:
      label803:
      UnifiedSearchHeader localUnifiedSearchHeader = (UnifiedSearchHeader)paramView;
      label785:
      label794:
      if (this.o == 0) {}
      ArrayList localArrayList3;
      for (int i3 = 0;; i3 = i1)
      {
        localUnifiedSearchHeader.i.a(i3);
        localUnifiedSearchHeader.j = this.j;
        localUnifiedSearchHeader.k = localSpannableStringBuilder;
        localUnifiedSearchHeader.b();
        if ((this.p == null) || (this.p.getCount() <= 0)) {
          break label1165;
        }
        localArrayList3 = new ArrayList();
        int i10 = this.p.getColumnIndex("avatar");
        int i11 = -1 + this.p.getCount();
        while (i1 <= i11)
        {
          this.p.moveToPosition(i1);
          localArrayList3.add(this.p.getString(i10));
          i1++;
        }
      }
      localUnifiedSearchHeader.l = localArrayList3;
      localUnifiedSearchHeader.c();
      if (Log.isLoggable("UnifiedSearchAdapter", 3))
      {
        int i12 = localArrayList3.size();
        new StringBuilder(42).append("bindStreamHeaderView(): ").append(i12).append(" people");
      }
      for (;;)
      {
        if ((this.i != null) && (this.i.getCount() > 0))
        {
          ArrayList localArrayList2 = new ArrayList();
          int i6 = this.i.getColumnIndex("photo_url");
          int i7 = this.i.getCount();
          int i8 = 0;
          for (;;)
          {
            if (i8 < i7)
            {
              this.i.moveToPosition(i8);
              localArrayList2.add(this.i.getString(i6));
              i8++;
              continue;
              label1165:
              localUnifiedSearchHeader.l = null;
              localUnifiedSearchHeader.c();
              break;
            }
          }
          localUnifiedSearchHeader.b(localArrayList2);
          if (Log.isLoggable("UnifiedSearchAdapter", 3))
          {
            int i9 = localArrayList2.size();
            new StringBuilder(47).append("bindStreamHeaderView(): ").append(i9).append(" communities");
          }
        }
      }
      while ((this.h != null) && (this.h.getCount() > 0))
      {
        ArrayList localArrayList1 = new ArrayList(this.h.getCount());
        int i4 = this.h.getColumnIndex("cover_photo_url");
        int i5 = this.h.getCount();
        for (;;)
        {
          if (i2 < i5)
          {
            this.h.moveToPosition(i2);
            localArrayList1.add(this.h.getString(i4));
            i2++;
            continue;
            localUnifiedSearchHeader.b(null);
            break;
          }
        }
        localUnifiedSearchHeader.a(localArrayList1);
        return;
      }
      localUnifiedSearchHeader.a(null);
      return;
      localSpannableStringBuilder = null;
    }
  }
  
  public final void a(View paramView, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    super.a(paramView, paramCursor, paramViewGroup);
    if ((paramCursor.getPosition() == 0) && ((paramView instanceof lpk)))
    {
      hfd localhfd = ((lpk)paramView).e;
      localhfd.setPadding(localhfd.getPaddingLeft(), this.aM.getResources().getDimensionPixelSize(efj.md), localhfd.getPaddingRight(), 0);
    }
  }
  
  public final void a(ArrayList paramArrayList)
  {
    if (this.q != paramArrayList)
    {
      this.q = paramArrayList;
      this.p = null;
    }
  }
  
  public final void b(Cursor paramCursor, int paramInt)
  {
    super.b(paramCursor, paramInt);
    if ((paramCursor != null) && (paramCursor.getCount() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      this.s = bool;
      return;
    }
  }
  
  public final void c(Cursor paramCursor)
  {
    if (this.p != paramCursor)
    {
      this.p = paramCursor;
      this.q = null;
    }
  }
  
  public final boolean isEmpty()
  {
    if ((this.p != null) && (this.p.getCount() > 0)) {}
    while (((this.q != null) && (this.q.size() > 0)) || ((this.i != null) && (this.i.getCount() > 0)) || ((this.h != null) && (this.h.getCount() > 0))) {
      return false;
    }
    return super.isEmpty();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dgm
 * JD-Core Version:    0.7.0.1
 */