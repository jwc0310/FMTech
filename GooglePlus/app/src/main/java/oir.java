import java.nio.ByteBuffer;

public final class oir
  extends qan<oir>
{
  private static volatile oir[] h;
  private Integer A = null;
  private Boolean B = null;
  private Integer C = null;
  private Integer D = null;
  private Boolean E = null;
  private String F = null;
  private String G = null;
  private String[] H = qay.f;
  private Integer I = null;
  private Integer J = null;
  private qbv[] K = qbv.a;
  private Long L = null;
  private Long M = null;
  private String[] N = qay.f;
  private Boolean O = null;
  private oiw[] P = oiw.b();
  private oib[] Q = oib.b();
  private Boolean R = null;
  private int S = -2147483648;
  public String a = null;
  public Integer b = null;
  public String c = null;
  public int d = -2147483648;
  public ojv e = null;
  public int f = -2147483648;
  public oif[] g = oif.b();
  private int i = -2147483648;
  private ojf j = null;
  private Boolean k = null;
  private String l = null;
  private String m = null;
  private String n = null;
  private String o = null;
  private String p = null;
  private String q = null;
  private ome r = null;
  private opo[] s = opo.c;
  private ojf[] t = ojf.b();
  private String[] u = qay.f;
  private int v = -2147483648;
  private Boolean w = null;
  private String x = null;
  private ood[] y = ood.b();
  private Integer z = null;
  
  public oir()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static oir[] b()
  {
    if (h == null) {}
    synchronized (qar.a)
    {
      if (h == null) {
        h = new oir[0];
      }
      return h;
    }
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = super.a();
    int i107;
    int i108;
    if (this.i != -2147483648)
    {
      int i106 = this.i;
      i107 = qal.d(8);
      if (i106 >= 0) {
        i108 = qal.d(i106);
      }
    }
    label291:
    label1323:
    for (int i3 = i2 + (i108 + i107);; i3 = i2)
    {
      if (this.j != null)
      {
        ojf localojf2 = this.j;
        int i104 = qal.d(16);
        int i105 = localojf2.a();
        localojf2.ak = i105;
        i3 += i104 + (i105 + qal.d(i105));
      }
      String str1 = this.a;
      int i4 = qal.d(24);
      int i5 = qal.a(str1);
      int i6 = i3 + (i4 + (i5 + qal.d(i5)));
      if (this.n != null)
      {
        String str14 = this.n;
        int i102 = qal.d(32);
        int i103 = qal.a(str14);
        i6 += i102 + (i103 + qal.d(i103));
      }
      int i101;
      label211:
      int i9;
      int i97;
      int i98;
      if (this.b != null)
      {
        int i99 = this.b.intValue();
        int i100 = qal.d(40);
        if (i99 >= 0)
        {
          i101 = qal.d(i99);
          i6 += i101 + i100;
        }
      }
      else
      {
        String str2 = this.c;
        int i7 = qal.d(48);
        int i8 = qal.a(str2);
        i9 = i6 + (i7 + (i8 + qal.d(i8)));
        if (this.d == -2147483648) {
          break label2373;
        }
        int i96 = this.d;
        i97 = qal.d(56);
        if (i96 < 0) {
          break label527;
        }
        i98 = qal.d(i96);
      }
      label1203:
      label1593:
      label1599:
      label2373:
      for (int i10 = i9 + (i98 + i97);; i10 = i9)
      {
        if (this.o != null)
        {
          String str13 = this.o;
          int i94 = qal.d(64);
          int i95 = qal.a(str13);
          i10 += i94 + (i95 + qal.d(i95));
        }
        if (this.p != null)
        {
          String str12 = this.p;
          int i92 = qal.d(72);
          int i93 = qal.a(str12);
          i10 += i92 + (i93 + qal.d(i93));
        }
        if (this.q != null)
        {
          String str11 = this.q;
          int i90 = qal.d(80);
          int i91 = qal.a(str11);
          i10 += i90 + (i91 + qal.d(i91));
        }
        if ((this.t != null) && (this.t.length > 0))
        {
          int i87 = 0;
          for (;;)
          {
            if (i87 < this.t.length)
            {
              ojf localojf1 = this.t[i87];
              if (localojf1 != null)
              {
                int i88 = qal.d(88);
                int i89 = localojf1.a();
                localojf1.ak = i89;
                i10 += i88 + (i89 + qal.d(i89));
              }
              i87++;
              continue;
              i108 = i1;
              break;
              i101 = i1;
              break label211;
              i98 = i1;
              break label291;
            }
          }
        }
        if ((this.s != null) && (this.s.length > 0))
        {
          int i83 = i10;
          for (int i84 = 0; i84 < this.s.length; i84++)
          {
            opo localopo = this.s[i84];
            if (localopo != null)
            {
              int i85 = qal.d(96);
              int i86 = localopo.a();
              localopo.ak = i86;
              i83 += i85 + (i86 + qal.d(i86));
            }
          }
          i10 = i83;
        }
        if ((this.u != null) && (this.u.length > 0))
        {
          int i79 = 0;
          int i80 = 0;
          int i81 = 0;
          while (i79 < this.u.length)
          {
            String str10 = this.u[i79];
            if (str10 != null)
            {
              i81++;
              int i82 = qal.a(str10);
              i80 += i82 + qal.d(i82);
            }
            i79++;
          }
          i10 = i10 + i80 + i81 * 1;
        }
        if (this.e != null)
        {
          ojv localojv = this.e;
          int i77 = qal.d(112);
          int i78 = localojv.a();
          localojv.ak = i78;
          i10 += i77 + (i78 + qal.d(i78));
        }
        int i74;
        int i75;
        if (this.v != -2147483648)
        {
          i74 = this.v;
          i75 = qal.d(120);
          if (i74 < 0) {
            break label886;
          }
        }
        int i71;
        int i72;
        label886:
        for (int i76 = qal.d(i74);; i76 = i1)
        {
          i10 += i76 + i75;
          if ((this.H == null) || (this.H.length <= 0)) {
            break label904;
          }
          int i70 = 0;
          i71 = 0;
          i72 = 0;
          while (i70 < this.H.length)
          {
            String str9 = this.H[i70];
            if (str9 != null)
            {
              i72++;
              int i73 = qal.a(str9);
              i71 += i73 + qal.d(i73);
            }
            i70++;
          }
        }
        i10 = i10 + i71 + i72 * 2;
        int i67;
        int i68;
        if (this.f != -2147483648)
        {
          i67 = this.f;
          i68 = qal.d(136);
          if (i67 < 0) {
            break label1111;
          }
        }
        int i61;
        label1111:
        for (int i69 = qal.d(i67);; i69 = i1)
        {
          i10 += i69 + i68;
          if (this.x != null)
          {
            String str8 = this.x;
            int i65 = qal.d(144);
            int i66 = qal.a(str8);
            i10 += i65 + (i66 + qal.d(i66));
          }
          if (this.w != null)
          {
            this.w.booleanValue();
            i10 += 1 + qal.d(152);
          }
          if ((this.y == null) || (this.y.length <= 0)) {
            break label1121;
          }
          i61 = i10;
          for (int i62 = 0; i62 < this.y.length; i62++)
          {
            ood localood = this.y[i62];
            if (localood != null)
            {
              int i63 = qal.d(160);
              int i64 = localood.a();
              localood.ak = i64;
              i61 += i63 + (i64 + qal.d(i64));
            }
          }
        }
        i10 = i61;
        label1121:
        int i60;
        int i57;
        int i54;
        label1277:
        int i51;
        int i46;
        int i41;
        int i42;
        if (this.z != null)
        {
          int i58 = this.z.intValue();
          int i59 = qal.d(168);
          if (i58 >= 0)
          {
            i60 = qal.d(i58);
            i10 += i60 + i59;
          }
        }
        else
        {
          if (this.A != null)
          {
            int i55 = this.A.intValue();
            int i56 = qal.d(176);
            if (i55 < 0) {
              break label1593;
            }
            i57 = qal.d(i55);
            i10 += i57 + i56;
          }
          if (this.B != null)
          {
            this.B.booleanValue();
            i10 += 1 + qal.d(184);
          }
          if (this.C != null)
          {
            int i52 = this.C.intValue();
            int i53 = qal.d(192);
            if (i52 < 0) {
              break label1599;
            }
            i54 = qal.d(i52);
            i10 += i54 + i53;
          }
          if (this.D != null)
          {
            int i49 = this.D.intValue();
            int i50 = qal.d(200);
            if (i49 < 0) {
              break label1605;
            }
            i51 = qal.d(i49);
            i10 += i51 + i50;
          }
          if (this.E != null)
          {
            this.E.booleanValue();
            i10 += 1 + qal.d(208);
          }
          if (this.G != null)
          {
            String str7 = this.G;
            int i47 = qal.d(216);
            int i48 = qal.a(str7);
            i10 += i47 + (i48 + qal.d(i48));
          }
          if (this.I != null)
          {
            int i44 = this.I.intValue();
            int i45 = qal.d(224);
            if (i44 < 0) {
              break label1611;
            }
            i46 = qal.d(i44);
            i10 += i46 + i45;
          }
          if (this.J != null)
          {
            i41 = this.J.intValue();
            i42 = qal.d(232);
            if (i41 < 0) {
              break label1617;
            }
          }
        }
        int i37;
        label1605:
        label1611:
        label1617:
        for (int i43 = qal.d(i41);; i43 = i1)
        {
          i10 += i43 + i42;
          if ((this.K == null) || (this.K.length <= 0)) {
            break label1627;
          }
          i37 = i10;
          for (int i38 = 0; i38 < this.K.length; i38++)
          {
            qbv localqbv = this.K[i38];
            if (localqbv != null)
            {
              int i39 = qal.d(240);
              int i40 = localqbv.a();
              localqbv.ak = i40;
              i37 += i39 + (i40 + qal.d(i40));
            }
          }
          i60 = i1;
          break;
          i57 = i1;
          break label1203;
          i54 = i1;
          break label1277;
          i51 = i1;
          break label1323;
          i46 = i1;
          break label1441;
        }
        i10 = i37;
        label1627:
        if (this.F != null)
        {
          String str6 = this.F;
          int i35 = qal.d(248);
          int i36 = qal.a(str6);
          i10 += i35 + (i36 + qal.d(i36));
        }
        if (this.L != null)
        {
          long l2 = this.L.longValue();
          i10 += qal.d(256) + qal.b(l2);
        }
        if (this.k != null)
        {
          this.k.booleanValue();
          i10 += 1 + qal.d(264);
        }
        if (this.M != null)
        {
          long l1 = this.M.longValue();
          i10 += qal.d(272) + qal.b(l1);
        }
        if ((this.N != null) && (this.N.length > 0))
        {
          int i31 = 0;
          int i32 = 0;
          int i33 = 0;
          while (i31 < this.N.length)
          {
            String str5 = this.N[i31];
            if (str5 != null)
            {
              i33++;
              int i34 = qal.a(str5);
              i32 += i34 + qal.d(i34);
            }
            i31++;
          }
          i10 = i10 + i32 + i33 * 2;
        }
        if ((this.g != null) && (this.g.length > 0))
        {
          int i27 = i10;
          for (int i28 = 0; i28 < this.g.length; i28++)
          {
            oif localoif = this.g[i28];
            if (localoif != null)
            {
              int i29 = qal.d(288);
              int i30 = localoif.a();
              localoif.ak = i30;
              i27 += i29 + (i30 + qal.d(i30));
            }
          }
          i10 = i27;
        }
        if (this.O != null)
        {
          this.O.booleanValue();
          i10 += 1 + qal.d(296);
        }
        if ((this.P != null) && (this.P.length > 0))
        {
          int i23 = i10;
          for (int i24 = 0; i24 < this.P.length; i24++)
          {
            oiw localoiw = this.P[i24];
            if (localoiw != null)
            {
              int i25 = qal.d(304);
              int i26 = localoiw.a();
              localoiw.ak = i26;
              i23 += i25 + (i26 + qal.d(i26));
            }
          }
          i10 = i23;
        }
        if (this.Q != null)
        {
          int i19 = this.Q.length;
          int i20 = 0;
          if (i19 > 0) {
            while (i20 < this.Q.length)
            {
              oib localoib = this.Q[i20];
              if (localoib != null)
              {
                int i21 = qal.d(312);
                int i22 = localoib.a();
                localoib.ak = i22;
                i10 += i21 + (i22 + qal.d(i22));
              }
              i20++;
            }
          }
        }
        if (this.l != null)
        {
          String str4 = this.l;
          int i17 = qal.d(320);
          int i18 = qal.a(str4);
          i10 += i17 + (i18 + qal.d(i18));
        }
        if (this.R != null)
        {
          this.R.booleanValue();
          i10 += 1 + qal.d(328);
        }
        if (this.S != -2147483648)
        {
          int i15 = this.S;
          int i16 = qal.d(336);
          if (i15 >= 0) {
            i1 = qal.d(i15);
          }
          i10 += i1 + i16;
        }
        if (this.r != null)
        {
          ome localome = this.r;
          int i13 = qal.d(344);
          int i14 = localome.a();
          localome.ak = i14;
          i10 += i13 + (i14 + qal.d(i14));
        }
        if (this.m != null)
        {
          String str3 = this.m;
          int i11 = qal.d(352);
          int i12 = qal.a(str3);
          i10 += i11 + (i12 + qal.d(i12));
        }
        return i10;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if (this.i != -2147483648)
    {
      int i28 = this.i;
      paramqal.c(8);
      paramqal.a(i28);
    }
    if (this.j != null)
    {
      ojf localojf2 = this.j;
      paramqal.c(18);
      if (localojf2.ak < 0) {
        localojf2.ak = localojf2.a();
      }
      paramqal.c(localojf2.ak);
      localojf2.a(paramqal);
    }
    String str1 = this.a;
    paramqal.c(26);
    paramqal.a(str1);
    if (this.n != null)
    {
      String str14 = this.n;
      paramqal.c(34);
      paramqal.a(str14);
    }
    if (this.b != null)
    {
      int i27 = this.b.intValue();
      paramqal.c(40);
      paramqal.a(i27);
    }
    String str2 = this.c;
    paramqal.c(50);
    paramqal.a(str2);
    if (this.d != -2147483648)
    {
      int i26 = this.d;
      paramqal.c(56);
      paramqal.a(i26);
    }
    if (this.o != null)
    {
      String str13 = this.o;
      paramqal.c(66);
      paramqal.a(str13);
    }
    if (this.p != null)
    {
      String str12 = this.p;
      paramqal.c(74);
      paramqal.a(str12);
    }
    if (this.q != null)
    {
      String str11 = this.q;
      paramqal.c(82);
      paramqal.a(str11);
    }
    if ((this.t != null) && (this.t.length > 0)) {
      for (int i25 = 0; i25 < this.t.length; i25++)
      {
        ojf localojf1 = this.t[i25];
        if (localojf1 != null)
        {
          paramqal.c(90);
          if (localojf1.ak < 0) {
            localojf1.ak = localojf1.a();
          }
          paramqal.c(localojf1.ak);
          localojf1.a(paramqal);
        }
      }
    }
    if ((this.s != null) && (this.s.length > 0)) {
      for (int i24 = 0; i24 < this.s.length; i24++)
      {
        opo localopo = this.s[i24];
        if (localopo != null)
        {
          paramqal.c(98);
          if (localopo.ak < 0) {
            localopo.ak = localopo.a();
          }
          paramqal.c(localopo.ak);
          localopo.a(paramqal);
        }
      }
    }
    if ((this.u != null) && (this.u.length > 0)) {
      for (int i23 = 0; i23 < this.u.length; i23++)
      {
        String str10 = this.u[i23];
        if (str10 != null)
        {
          paramqal.c(106);
          paramqal.a(str10);
        }
      }
    }
    if (this.e != null)
    {
      ojv localojv = this.e;
      paramqal.c(114);
      if (localojv.ak < 0) {
        localojv.ak = localojv.a();
      }
      paramqal.c(localojv.ak);
      localojv.a(paramqal);
    }
    if (this.v != -2147483648)
    {
      int i22 = this.v;
      paramqal.c(120);
      paramqal.a(i22);
    }
    if ((this.H != null) && (this.H.length > 0)) {
      for (int i21 = 0; i21 < this.H.length; i21++)
      {
        String str9 = this.H[i21];
        if (str9 != null)
        {
          paramqal.c(130);
          paramqal.a(str9);
        }
      }
    }
    if (this.f != -2147483648)
    {
      int i20 = this.f;
      paramqal.c(136);
      paramqal.a(i20);
    }
    if (this.x != null)
    {
      String str8 = this.x;
      paramqal.c(146);
      paramqal.a(str8);
    }
    if (this.w != null)
    {
      boolean bool6 = this.w.booleanValue();
      paramqal.c(152);
      if (bool6) {}
      byte b6;
      for (int i19 = i1;; i19 = 0)
      {
        b6 = (byte)i19;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b6);
    }
    if ((this.y != null) && (this.y.length > 0)) {
      for (int i18 = 0; i18 < this.y.length; i18++)
      {
        ood localood = this.y[i18];
        if (localood != null)
        {
          paramqal.c(162);
          if (localood.ak < 0) {
            localood.ak = localood.a();
          }
          paramqal.c(localood.ak);
          localood.a(paramqal);
        }
      }
    }
    if (this.z != null)
    {
      int i17 = this.z.intValue();
      paramqal.c(168);
      paramqal.a(i17);
    }
    if (this.A != null)
    {
      int i16 = this.A.intValue();
      paramqal.c(176);
      paramqal.a(i16);
    }
    if (this.B != null)
    {
      boolean bool5 = this.B.booleanValue();
      paramqal.c(184);
      if (bool5) {}
      byte b5;
      for (int i15 = i1;; i15 = 0)
      {
        b5 = (byte)i15;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b5);
    }
    if (this.C != null)
    {
      int i14 = this.C.intValue();
      paramqal.c(192);
      paramqal.a(i14);
    }
    if (this.D != null)
    {
      int i13 = this.D.intValue();
      paramqal.c(200);
      paramqal.a(i13);
    }
    if (this.E != null)
    {
      boolean bool4 = this.E.booleanValue();
      paramqal.c(208);
      if (bool4) {}
      byte b4;
      for (int i12 = i1;; i12 = 0)
      {
        b4 = (byte)i12;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.G != null)
    {
      String str7 = this.G;
      paramqal.c(218);
      paramqal.a(str7);
    }
    if (this.I != null)
    {
      int i11 = this.I.intValue();
      paramqal.c(224);
      paramqal.a(i11);
    }
    if (this.J != null)
    {
      int i10 = this.J.intValue();
      paramqal.c(232);
      paramqal.a(i10);
    }
    if ((this.K != null) && (this.K.length > 0)) {
      for (int i9 = 0; i9 < this.K.length; i9++)
      {
        qbv localqbv = this.K[i9];
        if (localqbv != null)
        {
          paramqal.c(242);
          if (localqbv.ak < 0) {
            localqbv.ak = localqbv.a();
          }
          paramqal.c(localqbv.ak);
          localqbv.a(paramqal);
        }
      }
    }
    if (this.F != null)
    {
      String str6 = this.F;
      paramqal.c(250);
      paramqal.a(str6);
    }
    if (this.L != null)
    {
      long l2 = this.L.longValue();
      paramqal.c(256);
      paramqal.a(l2);
    }
    if (this.k != null)
    {
      boolean bool3 = this.k.booleanValue();
      paramqal.c(264);
      if (bool3) {}
      byte b3;
      for (int i8 = i1;; i8 = 0)
      {
        b3 = (byte)i8;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.M != null)
    {
      long l1 = this.M.longValue();
      paramqal.c(272);
      paramqal.a(l1);
    }
    if ((this.N != null) && (this.N.length > 0)) {
      for (int i7 = 0; i7 < this.N.length; i7++)
      {
        String str5 = this.N[i7];
        if (str5 != null)
        {
          paramqal.c(282);
          paramqal.a(str5);
        }
      }
    }
    if ((this.g != null) && (this.g.length > 0)) {
      for (int i6 = 0; i6 < this.g.length; i6++)
      {
        oif localoif = this.g[i6];
        if (localoif != null)
        {
          paramqal.c(290);
          if (localoif.ak < 0) {
            localoif.ak = localoif.a();
          }
          paramqal.c(localoif.ak);
          localoif.a(paramqal);
        }
      }
    }
    if (this.O != null)
    {
      boolean bool2 = this.O.booleanValue();
      paramqal.c(296);
      if (bool2) {}
      byte b2;
      for (int i5 = i1;; i5 = 0)
      {
        b2 = (byte)i5;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if ((this.P != null) && (this.P.length > 0)) {
      for (int i4 = 0; i4 < this.P.length; i4++)
      {
        oiw localoiw = this.P[i4];
        if (localoiw != null)
        {
          paramqal.c(306);
          if (localoiw.ak < 0) {
            localoiw.ak = localoiw.a();
          }
          paramqal.c(localoiw.ak);
          localoiw.a(paramqal);
        }
      }
    }
    if ((this.Q != null) && (this.Q.length > 0)) {
      for (int i3 = 0; i3 < this.Q.length; i3++)
      {
        oib localoib = this.Q[i3];
        if (localoib != null)
        {
          paramqal.c(314);
          if (localoib.ak < 0) {
            localoib.ak = localoib.a();
          }
          paramqal.c(localoib.ak);
          localoib.a(paramqal);
        }
      }
    }
    if (this.l != null)
    {
      String str4 = this.l;
      paramqal.c(322);
      paramqal.a(str4);
    }
    if (this.R != null)
    {
      boolean bool1 = this.R.booleanValue();
      paramqal.c(328);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        i1 = 0;
      }
      paramqal.a.put(b1);
    }
    if (this.S != -2147483648)
    {
      int i2 = this.S;
      paramqal.c(336);
      paramqal.a(i2);
    }
    if (this.r != null)
    {
      ome localome = this.r;
      paramqal.c(346);
      if (localome.ak < 0) {
        localome.ak = localome.a();
      }
      paramqal.c(localome.ak);
      localome.a(paramqal);
    }
    if (this.m != null)
    {
      String str3 = this.m;
      paramqal.c(354);
      paramqal.a(str3);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oir
 * JD-Core Version:    0.7.0.1
 */