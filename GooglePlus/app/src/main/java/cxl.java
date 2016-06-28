import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import java.util.List;

public class cxl
  extends hqi
{
  private static final String[] i = { "_id", "index", "name", "display_name", "given_name", "avatar_url", "status" };
  public LayoutInflater f;
  public boolean g;
  public boolean h;
  private final git j;
  private final giz k;
  private boolean l;
  
  public cxl(Context paramContext)
  {
    super(paramContext, null);
    this.f = LayoutInflater.from(paramContext);
    this.k = ((giz)mbb.a(paramContext, giz.class));
    this.j = ((git)mbb.a(paramContext, git.class));
  }
  
  public View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.f.inflate(efj.sq, paramViewGroup, false);
  }
  
  public void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    a(paramView, paramCursor);
  }
  
  protected final void a(View paramView, Cursor paramCursor)
  {
    if (paramCursor.getInt(1) == -2)
    {
      paramView.findViewById(aaw.q).setVisibility(8);
      paramView.findViewById(aaw.hM).setVisibility(0);
      TextView localTextView3 = (TextView)paramView.findViewById(aaw.er);
      if (this.l) {}
      for (int i2 = aau.uM;; i2 = aau.sT)
      {
        localTextView3.setText(i2);
        return;
      }
    }
    paramView.findViewById(aaw.q).setVisibility(0);
    paramView.findViewById(aaw.hM).setVisibility(8);
    int m = paramCursor.getInt(1);
    String str1 = paramCursor.getString(3);
    String str2 = paramCursor.getString(2);
    String str3 = paramCursor.getString(5);
    int n;
    View localView;
    TextView localTextView1;
    TextView localTextView2;
    AvatarView localAvatarView;
    Resources localResources;
    if (paramCursor.getInt(6) == 1)
    {
      n = 1;
      localView = paramView.findViewById(aaw.jB);
      localTextView1 = (TextView)paramView.findViewById(aaw.cC);
      localTextView2 = (TextView)paramView.findViewById(aaw.s);
      localAvatarView = (AvatarView)paramView.findViewById(aaw.p);
      localResources = paramView.getContext().getResources();
      if (n == 0) {
        break label283;
      }
      paramView.findViewById(aaw.t).setVisibility(0);
      localTextView2.setTextColor(localResources.getColor(efj.jZ));
      localTextView1.setVisibility(8);
    }
    for (;;)
    {
      if (m != -1) {
        break label317;
      }
      localView.setVisibility(4);
      localTextView1.setText(str2);
      localTextView2.setVisibility(8);
      localTextView2.setText(str2);
      localAvatarView.setVisibility(4);
      return;
      n = 0;
      break;
      label283:
      paramView.findViewById(aaw.t).setVisibility(8);
      localTextView2.setTextColor(localResources.getColor(efj.ko));
      localTextView1.setVisibility(0);
    }
    label317:
    if ((this.g) && (m == this.j.c())) {}
    for (int i1 = 0;; i1 = 4)
    {
      localView.setVisibility(i1);
      localTextView1.setText(str1);
      localTextView2.setVisibility(0);
      localTextView2.setText(str2);
      localAvatarView.setVisibility(0);
      localAvatarView.a(null, str3);
      localAvatarView.g = false;
      return;
    }
  }
  
  public final void b()
  {
    List localList = this.k.a(new String[] { "logged_in" });
    localList.addAll(this.k.a(new String[] { "has_irrecoverable_error" }));
    this.l = false;
    MatrixCursor localMatrixCursor = new MatrixCursor(i);
    int m = localList.size();
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    if (n < m)
    {
      int i3 = ((Integer)localList.get(n)).intValue();
      gjb localgjb = this.k.a(i3);
      if (localgjb.c("is_plus_page")) {
        this.l = true;
      }
      Object[] arrayOfObject2 = new Object[7];
      int i4 = i1 + 1;
      arrayOfObject2[0] = Integer.valueOf(i1);
      arrayOfObject2[1] = Integer.valueOf(i3);
      arrayOfObject2[2] = localgjb.b("account_name");
      arrayOfObject2[3] = localgjb.b("display_name");
      arrayOfObject2[4] = localgjb.b("given_name");
      arrayOfObject2[5] = localgjb.b("profile_photo_url");
      int i5;
      if (localgjb.c("has_irrecoverable_error"))
      {
        i5 = 1;
        label228:
        arrayOfObject2[6] = Integer.valueOf(i5);
        localMatrixCursor.addRow(arrayOfObject2);
        if (((!localgjb.c("is_plus_page")) || (!localgjb.c("is_managed_account"))) && (localgjb.a("page_count", 0) == 0)) {
          break label311;
        }
      }
      label311:
      for (int i6 = 1;; i6 = 0)
      {
        int i7 = i2 | i6;
        n++;
        i2 = i7;
        i1 = i4;
        break;
        i5 = 0;
        break label228;
      }
    }
    if ((this.h) && (i2 != 0))
    {
      Object[] arrayOfObject1 = new Object[7];
      arrayOfObject1[0] = Integer.valueOf(i1);
      arrayOfObject1[1] = Integer.valueOf(-2);
      arrayOfObject1[2] = null;
      arrayOfObject1[3] = null;
      arrayOfObject1[4] = null;
      arrayOfObject1[5] = null;
      arrayOfObject1[6] = null;
      localMatrixCursor.addRow(arrayOfObject1);
    }
    a(localMatrixCursor);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cxl
 * JD-Core Version:    0.7.0.1
 */