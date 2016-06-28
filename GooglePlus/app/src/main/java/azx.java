import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spanned;
import com.google.android.apps.plus.service.EsService;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class azx
  extends mca
  implements dgy, luu
{
  azz Z;
  public ArrayList<String> a;
  private final azy aa = new azy(this);
  beu b;
  public bdk c;
  public int d;
  
  public final void a(int paramInt, Bundle paramBundle, String paramString)
  {
    int i = 1;
    ArrayList localArrayList1 = paramBundle.getIntegerArrayList("comment_action");
    if (localArrayList1 == null) {}
    azy localazy2;
    Integer localInteger1;
    do
    {
      String str1;
      azy localazy3;
      Integer localInteger2;
      do
      {
        azy localazy4;
        Integer localInteger3;
        do
        {
          azy localazy5;
          Integer localInteger4;
          do
          {
            azy localazy6;
            Integer localInteger5;
            do
            {
              azy localazy9;
              Integer localInteger6;
              do
              {
                azy localazy10;
                Integer localInteger7;
                do
                {
                  azy localazy11;
                  Integer localInteger8;
                  do
                  {
                    do
                    {
                      return;
                    } while (paramInt >= localArrayList1.size());
                    str1 = paramBundle.getString("comment_id");
                    int j = ((Integer)localArrayList1.get(paramInt)).intValue();
                    int k = this.m.getInt("account_id", -1);
                    switch (j)
                    {
                    case 285: 
                    case 286: 
                    default: 
                      return;
                    case 279: 
                      boolean bool = paramBundle.getBoolean("plusone_by_me");
                      String.valueOf(paramBundle.getLong("photo_id"));
                      this.m.getString("view_id");
                      Context localContext = f().getApplicationContext();
                      if (!bool) {}
                      for (;;)
                      {
                        EsService.a(localContext, k, null, str1, null, i, this.c.b.k());
                        return;
                        i = 0;
                      }
                    case 280: 
                      byte[] arrayOfByte = paramBundle.getByteArray("comment_content");
                      if (arrayOfByte == null) {}
                      for (Object localObject = null;; localObject = lwh.a(ByteBuffer.wrap(arrayOfByte)))
                      {
                        azy localazy12 = this.aa;
                        Bundle localBundle11 = gxy.a("extra_comment_id", str1);
                        localazy12.a.b.a(gxz.S, localBundle11);
                        int i12 = localazy12.a.m.getInt("account_id", -1);
                        bcp localbcp9 = localazy12.a.c.b;
                        Intent localIntent9 = efj.a(localazy12.a.f(), i12, null, str1, (Spanned)localObject, Long.valueOf(localbcp9.o()), localbcp9.j(), localbcp9.k(), false);
                        localazy12.a.a(localIntent9);
                        return;
                      }
                    case 282: 
                      localazy11 = this.aa;
                      int i11 = localazy11.a.m.getInt("account_id", -1);
                      Bundle localBundle10 = gxy.a("extra_comment_id", str1);
                      bcp localbcp8 = localazy11.a.c.b;
                      localazy11.a.b.a(gxz.Z, localBundle10);
                      bp localbp8 = localazy11.a.f();
                      Long localLong8 = Long.valueOf(localbcp8.o());
                      String str14 = localbcp8.k();
                      Intent localIntent8 = EsService.e.a(localbp8, EsService.class);
                      localIntent8.putExtra("op", 90);
                      localIntent8.putExtra("account_id", i11);
                      localIntent8.putExtra("photo_id", localLong8.longValue());
                      localIntent8.putExtra("comment_id", str1);
                      localIntent8.putExtra("is_undo", false);
                      localIntent8.putExtra("tile_id", str14);
                      localInteger8 = Integer.valueOf(EsService.a(localbp8, localIntent8));
                    }
                  } while (localazy11.a.Z == null);
                  localazy11.a.Z.a(localInteger8);
                  return;
                  localazy10 = this.aa;
                  int i10 = localazy10.a.m.getInt("account_id", -1);
                  Bundle localBundle9 = gxy.a("extra_comment_id", str1);
                  bcp localbcp7 = localazy10.a.c.b;
                  localazy10.a.b.a(gxz.Z, localBundle9);
                  bp localbp7 = localazy10.a.f();
                  Long localLong7 = Long.valueOf(localbcp7.o());
                  String str13 = localbcp7.k();
                  Intent localIntent7 = EsService.e.a(localbp7, EsService.class);
                  localIntent7.putExtra("op", 90);
                  localIntent7.putExtra("account_id", i10);
                  localIntent7.putExtra("photo_id", localLong7.longValue());
                  localIntent7.putExtra("comment_id", str1);
                  localIntent7.putExtra("is_undo", i);
                  localIntent7.putExtra("tile_id", str13);
                  localInteger7 = Integer.valueOf(EsService.a(localbp7, localIntent7));
                } while (localazy10.a.Z == null);
                localazy10.a.Z.a(localInteger7);
                return;
                localazy9 = this.aa;
                int i9 = localazy9.a.m.getInt("account_id", -1);
                Bundle localBundle8 = gxy.a("extra_comment_id", str1);
                bcp localbcp6 = localazy9.a.c.b;
                localazy9.a.b.a(gxz.Z, localBundle8);
                bp localbp6 = localazy9.a.f();
                Long localLong6 = Long.valueOf(localbcp6.o());
                String str12 = localbcp6.k();
                Intent localIntent6 = EsService.e.a(localbp6, EsService.class);
                localIntent6.putExtra("op", 90);
                localIntent6.putExtra("account_id", i9);
                localIntent6.putExtra("photo_id", localLong6.longValue());
                localIntent6.putExtra("comment_id", str1);
                localIntent6.putExtra("is_undo", false);
                localIntent6.putExtra("tile_id", str12);
                localInteger6 = Integer.valueOf(EsService.a(localbp6, localIntent6));
              } while (localazy9.a.Z == null);
              localazy9.a.Z.a(localInteger6);
              return;
              azy localazy8 = this.aa;
              Bundle localBundle7 = gxy.a("extra_comment_id", str1);
              localazy8.a.b.a(gxz.U, localBundle7);
              azx localazx2 = localazy8.a;
              int i5 = aau.kz;
              String str9 = localazx2.g().getString(i5);
              azx localazx3 = localazy8.a;
              int i6 = aau.ea;
              String str10 = localazx3.g().getString(i6);
              azx localazx4 = localazy8.a;
              int i7 = aau.mf;
              String str11 = localazx4.g().getString(i7);
              azx localazx5 = localazy8.a;
              int i8 = aau.cM;
              lut locallut2 = lut.a(str9, str10, str11, localazx5.g().getString(i8), 0, 0);
              locallut2.m.putString("comment_id", str1);
              locallut2.n = localazy8.a;
              locallut2.p = 0;
              locallut2.a(localazy8.a.x, "commentsdialog_delete_comment");
              return;
              azy localazy7 = this.aa;
              ArrayList localArrayList2 = new ArrayList(5);
              ArrayList localArrayList3 = new ArrayList(5);
              localArrayList2.add(localazy7.a.g().getString(aau.ut));
              localArrayList3.add(Integer.valueOf(288));
              localArrayList2.add(localazy7.a.g().getString(aau.us));
              localArrayList3.add(Integer.valueOf(289));
              localArrayList2.add(localazy7.a.g().getString(aau.ur));
              localArrayList3.add(Integer.valueOf(290));
              localArrayList2.add(localazy7.a.g().getString(aau.uq));
              localArrayList3.add(Integer.valueOf(291));
              localArrayList2.add(localazy7.a.g().getString(aau.up));
              localArrayList3.add(Integer.valueOf(292));
              String[] arrayOfString = new String[localArrayList2.size()];
              localArrayList2.toArray(arrayOfString);
              azx localazx1 = localazy7.a;
              int i4 = aau.uu;
              lut locallut1 = lut.a(localazx1.g().getString(i4), arrayOfString);
              locallut1.m.putString("comment_id", str1);
              locallut1.m.putIntegerArrayList("comment_action", localArrayList3);
              locallut1.n = localazy7.a;
              locallut1.p = 0;
              locallut1.a(localazy7.a.x, "commentsdialog_delete_comment");
              return;
              localazy6 = this.aa;
              int i3 = localazy6.a.m.getInt("account_id", -1);
              Bundle localBundle6 = gxy.a("extra_comment_id", str1);
              bcp localbcp5 = localazy6.a.c.b;
              localazy6.a.b.a(gxz.Z, localBundle6);
              bp localbp5 = localazy6.a.f();
              Long localLong5 = Long.valueOf(localbcp5.o());
              String str8 = localbcp5.k();
              Intent localIntent5 = EsService.e.a(localbp5, EsService.class);
              localIntent5.putExtra("op", 90);
              localIntent5.putExtra("account_id", i3);
              localIntent5.putExtra("photo_id", localLong5.longValue());
              localIntent5.putExtra("comment_id", str1);
              localIntent5.putExtra("is_undo", false);
              localIntent5.putExtra("tile_id", str8);
              localIntent5.putExtra("abuse_type", i);
              localInteger5 = Integer.valueOf(EsService.a(localbp5, localIntent5));
            } while (localazy6.a.Z == null);
            localazy6.a.Z.a(localInteger5);
            return;
            localazy5 = this.aa;
            int i2 = localazy5.a.m.getInt("account_id", -1);
            Bundle localBundle5 = gxy.a("extra_comment_id", str1);
            bcp localbcp4 = localazy5.a.c.b;
            localazy5.a.b.a(gxz.Z, localBundle5);
            bp localbp4 = localazy5.a.f();
            Long localLong4 = Long.valueOf(localbcp4.o());
            String str7 = localbcp4.k();
            Intent localIntent4 = EsService.e.a(localbp4, EsService.class);
            localIntent4.putExtra("op", 90);
            localIntent4.putExtra("account_id", i2);
            localIntent4.putExtra("photo_id", localLong4.longValue());
            localIntent4.putExtra("comment_id", str1);
            localIntent4.putExtra("is_undo", false);
            localIntent4.putExtra("tile_id", str7);
            localIntent4.putExtra("abuse_type", 2);
            localInteger4 = Integer.valueOf(EsService.a(localbp4, localIntent4));
          } while (localazy5.a.Z == null);
          localazy5.a.Z.a(localInteger4);
          return;
          localazy4 = this.aa;
          int i1 = localazy4.a.m.getInt("account_id", -1);
          Bundle localBundle4 = gxy.a("extra_comment_id", str1);
          bcp localbcp3 = localazy4.a.c.b;
          localazy4.a.b.a(gxz.Z, localBundle4);
          bp localbp3 = localazy4.a.f();
          Long localLong3 = Long.valueOf(localbcp3.o());
          String str6 = localbcp3.k();
          Intent localIntent3 = EsService.e.a(localbp3, EsService.class);
          localIntent3.putExtra("op", 90);
          localIntent3.putExtra("account_id", i1);
          localIntent3.putExtra("photo_id", localLong3.longValue());
          localIntent3.putExtra("comment_id", str1);
          localIntent3.putExtra("is_undo", false);
          localIntent3.putExtra("tile_id", str6);
          localIntent3.putExtra("abuse_type", 16);
          localInteger3 = Integer.valueOf(EsService.a(localbp3, localIntent3));
        } while (localazy4.a.Z == null);
        localazy4.a.Z.a(localInteger3);
        return;
        localazy3 = this.aa;
        int n = localazy3.a.m.getInt("account_id", -1);
        Bundle localBundle3 = gxy.a("extra_comment_id", str1);
        bcp localbcp2 = localazy3.a.c.b;
        localazy3.a.b.a(gxz.Z, localBundle3);
        bp localbp2 = localazy3.a.f();
        Long localLong2 = Long.valueOf(localbcp2.o());
        String str5 = localbcp2.k();
        Intent localIntent2 = EsService.e.a(localbp2, EsService.class);
        localIntent2.putExtra("op", 90);
        localIntent2.putExtra("account_id", n);
        localIntent2.putExtra("photo_id", localLong2.longValue());
        localIntent2.putExtra("comment_id", str1);
        localIntent2.putExtra("is_undo", false);
        localIntent2.putExtra("tile_id", str5);
        localIntent2.putExtra("abuse_type", 4);
        localInteger2 = Integer.valueOf(EsService.a(localbp2, localIntent2));
      } while (localazy3.a.Z == null);
      localazy3.a.Z.a(localInteger2);
      return;
      localazy2 = this.aa;
      int m = localazy2.a.m.getInt("account_id", -1);
      Bundle localBundle2 = gxy.a("extra_comment_id", str1);
      bcp localbcp1 = localazy2.a.c.b;
      localazy2.a.b.a(gxz.Z, localBundle2);
      bp localbp1 = localazy2.a.f();
      Long localLong1 = Long.valueOf(localbcp1.o());
      String str4 = localbcp1.k();
      Intent localIntent1 = EsService.e.a(localbp1, EsService.class);
      localIntent1.putExtra("op", 90);
      localIntent1.putExtra("account_id", m);
      localIntent1.putExtra("photo_id", localLong1.longValue());
      localIntent1.putExtra("comment_id", str1);
      localIntent1.putExtra("is_undo", false);
      localIntent1.putExtra("tile_id", str4);
      localIntent1.putExtra("abuse_type", 17);
      localInteger1 = Integer.valueOf(EsService.a(localbp1, localIntent1));
    } while (localazy2.a.Z == null);
    localazy2.a.Z.a(localInteger1);
    return;
    azy localazy1 = this.aa;
    String str2 = paramBundle.getString("comment_author_id");
    String str3 = paramBundle.getString("comment_author_name");
    Bundle localBundle1 = new Bundle();
    localBundle1.putString("comment_author_id", str2);
    localBundle1.putString("comment_author_name", str3);
    ((dhd)localazy1.a.bo.a(dhd.class)).c().a(str3).a(localBundle1).a().a(localazy1.a.h(), "commentsdialog_block_person");
  }
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.d = this.m.getInt("account_id", -1);
    if ((paramBundle != null) && (paramBundle.containsKey("blocked_gaia_ids")))
    {
      this.a = paramBundle.getStringArrayList("blocked_gaia_ids");
      return;
    }
    this.a = new ArrayList();
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    bcp localbcp = this.c.b;
    int i = this.m.getInt("account_id", -1);
    Integer localInteger;
    if ("commentsdialog_delete_comment".equals(paramString))
    {
      String str4 = this.m.getString("view_id");
      bp localbp = f();
      Long localLong = Long.valueOf(localbcp.o());
      String str5 = paramBundle.getString("comment_id");
      String str6 = localbcp.k();
      Intent localIntent = EsService.e.a(localbp, EsService.class);
      localIntent.putExtra("op", 89);
      localIntent.putExtra("account_id", i);
      localIntent.putExtra("photo_id", localLong.longValue());
      localIntent.putExtra("comment_id", str5);
      localIntent.putExtra("tile_id", str6);
      localIntent.putExtra("view_id", str4);
      localInteger = Integer.valueOf(EsService.a(localbp, localIntent));
    }
    boolean bool1;
    do
    {
      if ((this.Z != null) && (localInteger != null)) {
        this.Z.a(localInteger);
      }
      return;
      bool1 = "commentsdialog_delete_shape".equals(paramString);
      localInteger = null;
    } while (!bool1);
    String str1 = this.m.getString("view_id");
    Context localContext = f().getApplicationContext();
    long l1 = localbcp.o();
    String str2 = localbcp.j();
    long l2 = paramBundle.getLong("shape_id");
    String str3 = localbcp.k();
    if (!paramBundle.getBoolean("permanent_delete")) {}
    for (boolean bool2 = true;; bool2 = false)
    {
      localInteger = Integer.valueOf(EsService.a(localContext, i, l1, str2, l2, str1, str3, bool2));
      break;
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    Bundle localBundle = (Bundle)paramParcelable;
    int i = this.m.getInt("account_id", -1);
    String str1 = localBundle.getString("comment_author_id");
    String str2 = localBundle.getString("comment_author_name");
    String str3 = String.valueOf(str1);
    if (str3.length() != 0) {}
    for (String str4 = "g:".concat(str3);; str4 = new String("g:"))
    {
      Integer localInteger = EsService.b(f(), i, str4, str2, true);
      if (this.Z != null) {
        this.Z.a(localInteger);
      }
      this.b.a(gxz.bD);
      return;
    }
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.b = ((beu)this.bo.a(beu.class));
    this.c = ((bdk)this.bo.a(bdk.class));
    this.bo.a(dgy.class, this);
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putStringArrayList("blocked_gaia_ids", this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     azx
 * JD-Core Version:    0.7.0.1
 */