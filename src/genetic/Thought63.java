package genetic;
import java.util.ArrayList;
class Thought63 extends Thought{
private static ArrayList<Thought63> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 142.2100173134156;
private double fd1 = 101.95737788382613;
private Thought fo0 = null;
private Thought fo1 = null;
Thought63 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought63 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought63 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought63 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought63 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought63 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought63 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought63 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought63 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld0 = 581.1661667242549;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
    fd1 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ld0;
    lb2 = fb0 || fb1;
    lb1 = lb2 && fb0;
    fb1 = lb1 && lb2;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
        ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
    fb0 = !fb1;
    double ld3 = 700.595429765891;
if(fo0 != null){
      lb1 = fo0.m2(ld0, ld3, fd0, fd1, lb2, fb0, fb1, lb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
        if (ab3) {
            ab4 = fd0 > fd1;
            boolean lb0 = true;
            ab4 = fd0 < fd1;
            fb0 = fd0 > fd1;
            fb1 = !lb0;
            ab1 = fd0 > fd1;
            fd0 *= -1;
            ab2 = fd1 > fd0;
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
            lb0 = ab1 || ab2;
            double ld1 = 574.2638879140052;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 577.3304854484005;
    fb1 = !fb0;
if(fo0 != null){
      ad1 = fo0.m3();
}
    Thought lo1 = Thought62.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
    ad2 = ad3 - ad4;
    fb0 = fd0 > fd1;
    ld0 = ad1 - ad2;
    Output.points[5][0] -= ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1();
}
    ad1 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 > ad2;
        boolean lb0 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    ab2 = !ab3;
    Output.points[5][1] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        ab1 = !ab2;
        ab3 = ab4 && fb0;
        ad2 = ad3 - ad4;
        fb1 = lb0 && ab1;
        ab2 = fd0 > fd1;
        ad1 = ad2 - ad3;
        ab3 = !ab4;
        ad4 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
        fb0 = fb1 || lb0;
        double ld1 = 272.1469944123195;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    if (fb0) {
        Output.points[5][2] += fd1;
        fb1 = fd0 > fd1;
        Output.points[5][3] += fd0;
        double ld1 = 848.8945924529908;
        fd0 *= -1;
        double ld2 = 927.4156040202483;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld1, ld2, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
        fd0 = fd1 + ld1;
        double ld3 = 954.2820544961578;
if(ao3 != null){
          ao3.m2();
}
        } else if (fb1) {
        lb0 = fd1 < fd0;
        boolean lb4 = true;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb4);
}
        double ld5 = 577.1362550784706;
        double ld6 = 196.99072210373353;
if(ao3 != null){
          ld5 = ao3.m3(lb0, fb0, fb1, lb4);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
          ao4 = fo0.m4(ld6, fd0, fd1, ld5);
}
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ld6, fd0, fd1, ld5);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    double ld1 = 144.21198429059734;
    double ld2 = 502.5655026987542;
    boolean lb3 = true;
if(ao2 != null){
      ao1 = ao2.m4(ld2, ad1, ad2, ad3, lb3, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, lb3, fb0, fb1, lb0);
}
    double ld4 = 850.9495905185304;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao2.m2();
}
    Thought lo5 = Thought307.getInstance(ao3, ao4, fo0, fo1, fd1, ld1, ld2, ld4, lb3, fb0, fb1, lb0);
    if (lb3) {
        fb0 = ad1 > ad2;
        ad3 = ad4 + fd0;
        fd1 = ld1 - ld2;
        fb1 = !lb0;
        lb3 = !fb0;
        double ld6 = 245.80300954222037;
        fb1 = ld2 < ld4;
if(ao1 != null){
          lb0 = ao1.m2(lb3, fb0, fb1, lb0);
}
if(ao2 != null){
          ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
        lb3 = fb0 || fb1;
        boolean lb7 = true;
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    ab1 = !ab2;
    Thought lo0 = Thought386.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    Thought lo1 = Thought138.getInstance(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
if(ao4 != null){
          fb0 = ao4.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought387.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      lb2 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 < fd1;
    ab2 = !ab3;
    Thought lo4 = Thought118.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb2);
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][4] += ad2;
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    ad4 = fd0 - fd1;
    fb1 = ab1 && ab2;
    double ld0 = 476.36449403228426;
    ab3 = ab4 || fb0;
    Thought lo1 = Thought390.getInstance();
    fb1 = ab1 || ab2;
    ld0 = ad1 + ad2;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
        Thought lo0 = Thought232.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought26.getInstance();
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
    fd1 *= -1;
    Thought lo2 = Thought204.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought202.getInstance(fd0, fd1, fd0, fd1);
    boolean lb4 = false;

Thought.STACK_COUNTER++;
return lb4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought96.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        double ld1 = 782.3814095147616;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, ab1, ab2);
}
        fd0 = fd1 + ld1;
        fd0 = fd1 + ld1;
        Thought lo2 = Thought294.getInstance(ab3, ab4, fb0, fb1);
        } else if (ab1) {
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        double ld3 = 85.80495359488806;
        ab1 = ab2 || ab3;
        ab4 = fd0 < fd1;
        fb0 = ld3 < fd0;
        fb1 = ab1 && ab2;
        fd1 = ld3 + fd0;
        double ld4 = 631.351771584467;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        for(int i1=0; i1<10; i1++){
            }
        fb1 = fb0 && fb1;
        fb0 = fb1 || fb0;
if(fo0 != null){
          fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m1(fd1, ad1, ad2, ad3);
}
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought55.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
    Output.points[5][5] += ad1;
    Thought lo1 = Thought324.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb2);
}
    fd1 *= -1;
    Thought lo3 = Thought23.getInstance(fo1, fo0, fo1, fo0);

Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
        fb0 = fd1 > fd0;
    Thought lo0 = Thought219.getInstance();
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought16.getInstance(ad1, ad2, ad3, ad4);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    fb0 = ad3 < ad4;
    Output.points[5][6] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
    boolean lb1 = false;
    fd0 *= -1;
    Thought lo2 = Thought166.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb3 = false;
    boolean lb4 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, lb4, fb0, fb1, lb1);
}
if(ao4 != null){
      ad4 = ao4.m3(lb3, lb4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb1 = fd0 < fd1;
    lb3 = lb4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        fb1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    lb1 = fd0 < fd1;
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, lb3, lb4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    ab1 = ab2 && ab3;
        ab4 = fd1 > fd0;
    boolean lb0 = true;
    double ld1 = 710.4897257745621;
    fd0 = fd1 - ld1;
    boolean lb2 = true;
    double ld3 = 931.1565343306543;
    ab3 = ab4 && fb0;
    Output.points[5][7] -= ld3;
    boolean lb4 = true;
    fd0 = fd1 + ld1;
    boolean lb5 = false;
    Output.points[5][8] += ld3;
if(ao1 != null){
      ab4 = ao1.m2();
}
    Output.points[6][0] -= fd0;
    boolean lb6 = false;
    ab4 = fb0 && fb1;
    double ld7 = 417.17671105816606;
    lb0 = fd0 < fd1;

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = ab1 || ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
if(ao2 != null){
      ao2.m1(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab1 = ao2.m2(fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 - ad3;
    Output.points[6][1] += ad4;
    fb1 = fd0 < fd1;
        lb0 = ab1 && ab2;
    ad1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo1 = Thought157.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
if(ao3 != null){
      ao3.m2(ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
    double ld2 = 771.8251758082828;
    ab4 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd0 *= -1;

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb0 = lb1 && lb2;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb2);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    Thought lo3 = Thought331.getInstance();
    fb0 = fb1 || lb0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, lb4, fb0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || lb1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    fb0 = fd1 < fd0;
    fb1 = ab1 && ab2;
        ab3 = !ab4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 + fd1;
    double ld0 = 79.05109234223606;
    ld0 = fd0 - fd1;
    Output.points[6][2] -= ld0;
    boolean lb1 = true;
    Thought lo2 = Thought37.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, lb1, ab1);
    fd1 = ld0 + fd0;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    Output.points[6][3] += fd1;
    double ld0 = 120.5761920472718;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
    double ld1 = 22.819186252327594;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ld0 = ld1 + ad1;
    ad2 = ad3 - ad4;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 < ad3;
    for(int i0=0; i0<10; i0++){
        }
    Thought lo0 = Thought35.getInstance(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    ad2 *= -1;
    Thought lo1 = Thought397.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
    ad3 = ad4 + fd0;
    double ld2 = 852.0288887150092;
    double ld3 = 527.6501647694996;
if(fo0 != null){
          fo1 = fo0.m4();
}
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld3, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    double ld4 = 436.3764333825183;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    double ld5 = 522.556522539586;
if(fo0 != null){
      ld4 = fo0.m3(fo1, fo0, fo1, fo0);
}

Thought.STACK_COUNTER++;
return ld5;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    fb1 = !fb0;
    fb1 = !fb0;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    double ld0 = 524.1912302124632;
    boolean lb1 = false;
    fb0 = ld0 > fd0;
if(ao4 != null){
      ao4.m2(fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 || fb1;
    lb1 = fb0 || fb1;
    ld0 *= -1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fb1 && lb0;
if(ao1 != null){
      ao1.m2();
}
    double ld1 = 33.45062912962634;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
        Output.points[6][4] += ld1;
        fb0 = fb1 || lb0;
if(ao3 != null){
          ao2 = ao3.m4(lb2, fb0, fb1, lb0);
}
        ad1 *= -1;
        lb2 = !fb0;
        Output.points[6][5] -= ad2;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        fb1 = lb0 && lb2;
        Thought lo3 = Thought377.getInstance(ad3, ad4, fd0, fd1);
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3);
}
        ad4 *= -1;
        Thought lo4 = Thought191.getInstance(fd0, fd1, ld1, ad1, fb0, fb1, lb0, lb2);
        boolean lb5 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb5);
}
}
Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought1.getInstance(fb0, fb1, lb0, ab1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld2 = 431.28223939514567;
    Thought lo3 = Thought4.getInstance(ld2, fd0, fd1, ld2);
    fd0 *= -1;
    Output.points[6][6] += fd1;
    Output.points[6][7] += ld2;
    fd0 = fd1 + ld2;
    boolean lb4 = true;
    ab1 = fd0 > fd1;
    ab2 = ab3 && ab4;
    Output.points[6][8] += ld2;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ao1.m3(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
          ad2 = ao2.m3(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    ab1 = ad3 < ad4;
    fd0 = fd1 - ad1;
    ab2 = ad2 > ad3;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
    ab3 = ad3 < ad4;
    ab4 = !fb0;
        double ld0 = 895.7778934874157;
    boolean lb1 = true;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0);
}
        boolean lb3 = true;
if(ao3 != null){
      ad1 = ao3.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    lb1 = !lb2;
    if (lb3) {
        } else {
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fd0 *= -1;
    Thought lo0 = Thought277.getInstance();
    Thought lo1 = Thought4.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
    fb1 = !fb0;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought349.getInstance(fd1, fd0, fd1, fd0);
    double ld1 = 650.8123790688434;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    boolean lb2 = false;
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb2;
    ab1 = fd1 > ld1;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb1, lb2, ab1, ab2);
}
if(fo0 != null){
      fd0 = fo0.m3(ab3, ab4, fb0, fb1);
}
    lb2 = ab1 && ab2;
    Output.points[7][0] += fd1;
    ld1 = fd0 - fd1;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      lb2 = fo0.m2(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld1 = fd0 - fd1;
    fb1 = ld1 < fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1();
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
    Thought lo0 = Thought319.getInstance(fb0, fb1, fb0, fb1);
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - ad1;
    lb1 = fb0 || fb1;
    lb1 = !fb0;
    fb1 = ad2 > ad3;
    lb1 = !fb0;
    double ld2 = 416.7137391350026;
    fb1 = lb1 && fb0;
    ad3 = ad4 + fd0;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    double ld0 = 17.149785991641796;
    ab4 = ld0 < ad1;
    boolean lb1 = false;
    ab4 = !fb0;
    fb1 = ad2 > ad3;
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ld0);
}
    lb1 = ab1 && ab2;
    boolean lb2 = false;
    ab2 = ab3 && ab4;
    boolean lb3 = true;
    double ld4 = 840.5551915832749;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
    double ld5 = 201.07014161331904;
    double ld6 = 241.89608859848863;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb3, ab1, ab2);
}
        double ld7 = 883.031506543714;
if(fo1 != null){
          ab3 = fo1.m2();
}
        ab4 = ld0 < ld4;
        Thought lo8 = Thought118.getInstance(fo0, fo1, fo0, fo1, ld5, ld6, ad1, ad2, fb0, fb1, lb1, lb2);
        boolean lb9 = true;
        lb2 = ad3 > ad4;
        fd0 *= -1;
        boolean lb10 = false;
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
        boolean lb0 = false;
    Thought lo1 = Thought108.getInstance(ao3, ao4, fo0, fo1);
    lb0 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    Output.points[7][1] += fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, lb0, lb2, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, lb2, fb0, fb1);
}
    boolean lb3 = false;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    boolean lb4 = false;
    fd0 *= -1;
    lb0 = lb2 || lb3;
    lb4 = fd1 > fd0;
    double ld5 = 336.7116215121572;
    fb0 = fd0 > fd1;
    fb1 = lb0 || lb2;
    ld5 *= -1;
    double ld6 = 471.24882119566433;
    ld6 = fd0 - fd1;

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = fb1 && lb0;
    fb0 = fb1 && lb0;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    fb0 = ad1 > ad2;
    fb1 = ad3 < ad4;
    lb0 = fd0 > fd1;
    boolean lb1 = true;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
if(ao2 != null){
      lb1 = ao2.m2(fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    double ld2 = 631.593021780758;
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao3.m3(ld2, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ld2, ad1, ad2, ad3);
}
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ld2, ad1, fb1, lb0, lb1, fb0);
}
    ad2 *= -1;
    fb1 = ad3 > ad4;
    fd0 *= -1;
    if (lb0) {
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb0);
}
        boolean lb3 = true;
if(ao3 != null){
          ld2 = ao3.m3();
}
        lb0 = !lb1;
}
Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    boolean lb2 = false;
    fd0 = fd1 + fd0;
    boolean lb3 = false;
    ab2 = fd1 < fd0;
if(ao1 != null){
      ao1.m2(ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    double ld4 = 402.38581731249735;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    lb0 = ab1 || ab2;
    boolean lb1 = true;
    fd1 = ad1 + ad2;
    ab2 = ab3 && ab4;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    fb1 = !lb0;
    double ld2 = 799.0134887691775;
if(ao2 != null){
      lb1 = ao2.m2(ld2, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
    ab1 = ab2 || ab3;
if(ao2 != null){
      ab4 = ao2.m2();
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ad1, fb0, fb1, lb0, lb1);
}
    Thought lo3 = Thought381.getInstance(ab1, ab2, ab3, ab4);

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
    lb0 = fd0 < fd1;
    fd0 *= -1;
        fd1 = fd0 - fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      lb1 = fo0.m2();
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
    fb1 = lb0 || lb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought85.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought85.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb2 = false;
    fd0 = fd1 - fd0;
    Thought lo3 = Thought397.getInstance(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb2);
        Output.points[7][2] -= fd1;
        boolean lb4 = false;
if(fo0 != null){
      lb4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb4);
}
    boolean lb5 = false;
    fd0 = fd1 + fd0;
    lb5 = fb0 || fb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2();
}
    Thought lo0 = Thought227.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Output.points[7][3] -= fd1;
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    Thought lo1 = Thought73.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 + fd0;
    fb1 = !fb0;
    double ld2 = 363.42421600987547;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
    double ld3 = 749.034846150482;
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld2, ld3, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld2, ld3, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[7][4] -= fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
