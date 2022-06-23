package genetic;
import java.util.ArrayList;
class Thought5 extends Thought{
private static ArrayList<Thought5> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 3.5888178740432717;
private double fd1 = 603.4120785668943;
private Thought fo0 = null;
private Thought fo1 = null;
Thought5 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought5 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought5 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought5 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought5 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought5 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought5 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought5 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought5 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    Thought lo0 = Thought23.getInstance(fd1, fd0, fd1, fd0);
    fb1 = fd1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld1 = 956.7457275183004;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    Output.points[6][2] += fd0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb3 = false;
        double ld4 = 430.0875567196348;
        double ld5 = 212.54236926546417;
        boolean lb6 = false;
        lb3 = lb6 && lb2;
if(fo1 != null){
          fo0 = fo1.m4(ld1, fd0, fd1, ld4, fb0, fb1, lb3, lb6);
}
if(fo0 != null){
          ld5 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld4, lb2, fb0, fb1, lb3);
}
if(fo1 != null){
          ld5 = fo1.m3(fo0, fo1, fo0, fo1, lb6, lb2, fb0, fb1);
}
        boolean lb7 = true;
if(fo1 != null){
          fo0 = fo1.m4(ld1, fd0, fd1, ld4);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    ab1 = ab2 && ab3;
    double ld1 = 509.82398610814954;
    ab4 = ld1 < fd0;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    boolean lb2 = true;
    ld1 *= -1;

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
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        double ld0 = 836.967296374358;
    Thought lo1 = Thought97.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
    Thought lo2 = Thought4.getInstance(ad3, ad4, fd0, fd1);
    Output.points[6][3] += ld0;
    ad1 = ad2 - ad3;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + ad1;
    fb1 = ab1 || ab2;
    Output.points[6][4] -= ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    boolean lb0 = false;
    ad1 = ad2 - ad3;
    Thought lo1 = Thought79.getInstance(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !lb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = ad1 > ad2;
    fb1 = ad3 < ad4;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    fd0 = fd1 + ad1;
    Thought lo3 = Thought49.getInstance(ad2, ad3, ad4, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ab4 = fb0 && fb1;

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
    double ld0 = 402.9247520450692;
    fd0 = fd1 - ld0;
    Output.points[6][5] -= fd0;
    fd1 = ld0 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    double ld1 = 340.8427747376705;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4();
}
        fd1 *= -1;
if(fo1 != null){
      ld0 = fo1.m3(ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    double ld2 = 525.8617701585285;
    ld1 *= -1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought59.getInstance(ld2, fd0, fd1, ld0);

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
    fb0 = !fb1;
        boolean lb0 = true;
    lb0 = fb0 && fb1;
    ad2 = ad3 - ad4;
    double ld1 = 0.02759564238756884;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld1);
}
    ad1 *= -1;
    if (lb0) {
        Thought lo2 = Thought74.getInstance(fb0, fb1, lb0, fb0);
        double ld3 = 861.5907326824184;
if(ao2 != null){
          fb1 = ao2.m2();
}
        double ld4 = 401.46351175658316;
if(ao3 != null){
          ao3.m2(ld1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
        ad4 = fd0 - fd1;
        fb0 = !fb1;
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
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        }
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
    fb0 = fb1 && ab1;
    for(int i1=0; i1<10; i1++){
        double ld0 = 985.5245227608699;
        if (ab2) {
            double ld1 = 410.40796819620857;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
            boolean lb2 = true;
            ld0 *= -1;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb2, ab1, ab2, ab3);
}
            if (ab4) {
if(ao2 != null){
                  ao1 = ao2.m4(fd0, fd1, ld1, ld0);
}
                fb0 = fb1 || lb2;
if(ao3 != null){
                  ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ld0);
}
                ab1 = ab2 || ab3;
                Thought lo3 = Thought86.getInstance(ab4, fb0, fb1, lb2);
                Thought lo4 = Thought78.getInstance();
                ab1 = fd0 < fd1;
                ab2 = ab3 || ab4;
                } else {
if(ao3 != null){
                  ao2 = ao3.m4(ld1, ld0, fd0, fd1, fb0, fb1, lb2, ab1);
}
                ld1 = ld0 + fd0;
}}}
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[6][6] -= ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought83.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
if(ao2 != null){
      ab3 = ao2.m2(ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao3.m3();
}
    ab1 = ab2 || ab3;
    boolean lb2 = false;
    ab3 = ab4 || fb0;

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
    boolean lb0 = true;
        fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought2.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fd0 *= -1;
    Output.points[6][7] -= fd1;
    Output.points[6][8] += fd0;
    Thought lo2 = Thought49.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    double ld3 = 525.2547008218872;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld3, fd0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1);
}
    ld3 = fd0 - fd1;
    Thought lo4 = Thought32.getInstance(lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld3, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 && fb0;
        fd0 = fd1 - ld3;
    fb1 = lb0 && fb0;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    boolean lb0 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought54.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    ab4 = fd0 < fd1;
    Output.points[7][0] += fd0;
    fd1 = fd0 - fd1;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1();
}
    Thought lo2 = Thought32.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
    ab2 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[7][1] -= fd0;
    fd1 = fd0 + fd1;
    ab3 = fd0 > fd1;
    Thought lo3 = Thought1.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb4 = false;
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb1 = fb0 || fb1;
    fd1 *= -1;
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
    fb1 = fd1 > ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought72.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);

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
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ad1 = ad2 + ad3;
    ab1 = ab2 || ab3;
    boolean lb0 = false;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    double ld1 = 6.214500663890727;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ld1 - ad1;
if(fo0 != null){
      fb1 = fo0.m2(lb0, ab1, ab2, ab3);
}
    Thought lo2 = Thought23.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    ab1 = fd1 > ld1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
    fd0 *= -1;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought45.getInstance(fd1, fd0, fd1, fd0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;

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
    double ld0 = 490.71650988774337;
    Output.points[7][2] -= ad1;
    ad2 = ad3 + ad4;
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    Output.points[7][3] -= ad4;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    ad1 *= -1;
    double ld1 = 920.4234443551048;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    ld1 *= -1;
    fb1 = ad1 > ad2;
    if (fb0) {
        fb1 = fb0 || fb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ab1 = ao1.m2(fd0, fd1, fd0, fd1);
}
        Thought lo1 = Thought28.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
        ab2 = !ab3;
if(fo1 != null){
          fd0 = fo1.m3(ab4, fb0, fb1, lb0);
}
        fd1 = fd0 - fd1;
if(ao1 != null){
          fd0 = ao1.m3();
}
        if (ab1) {
            Output.points[7][4] += fd1;
            ab2 = ab3 || ab4;
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][5] -= ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ad1 + ad2;
    Thought lo0 = Thought72.getInstance(ao4, fo0, fo1, ao1);
        ad3 = ad4 - fd0;
    fb0 = !fb1;
    boolean lb1 = true;
    boolean lb2 = false;
    Thought lo3 = Thought68.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, lb1, lb2, ab1, ab2);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb4 = true;
    for(int i0=0; i0<10; i0++){
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    double ld0 = 86.95730025802457;
    boolean lb1 = false;
    boolean lb2 = false;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb3, fb0, fb1);
}
    fd0 = fd1 + ld0;
    fd0 *= -1;
    lb1 = fd1 > ld0;
    double ld4 = 824.4566369495799;
    boolean lb5 = true;
    lb2 = lb3 || lb5;
    boolean lb6 = false;
    lb6 = ld4 > fd0;
    fd1 = ld0 + ld4;

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
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
        ab2 = fd0 > fd1;
if(fo0 != null){
      ab3 = fo0.m2();
}
    fd0 *= -1;
    Output.points[7][6] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
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
    fb1 = fb0 && fb1;
    fb0 = ad1 > ad2;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought14.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    double ld1 = 703.9042864442104;
    fb0 = fb1 && fb0;
    boolean lb2 = true;
    Thought lo3 = Thought95.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    fb0 = fb1 && lb2;
    double ld4 = 646.1554672532169;
    Output.points[7][7] -= fd0;
    boolean lb5 = true;
    lb5 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3(lb2, lb5, fb0, fb1);
}
    lb2 = ld1 > ld4;
    lb5 = ad1 < ad2;
    if (fb0) {
}
Thought.STACK_COUNTER++;
return ad3;
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = ab1 && ab2;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    boolean lb0 = true;
    lb0 = ab1 && ab2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb0 = fd1 > ad1;
    ab1 = ad2 > ad3;
    boolean lb1 = false;
    double ld2 = 270.8556042110788;
    ad3 = ad4 - fd0;
    double ld3 = 759.4732774414516;
    boolean lb4 = false;
    Thought lo5 = Thought71.getInstance(fd0, fd1, ld2, ld3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld6 = 356.237328774873;
    Output.points[7][8] += ad4;
if(fo1 != null){
      fo0 = fo1.m4(lb4, ab1, ab2, ab3);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fo1.m2(fd1, ld2, ld3, ld6, ab4, fb0, fb1, lb0);
}
    ad1 *= -1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    double ld0 = 523.6181188312572;
    boolean lb1 = false;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ld0 *= -1;
    boolean lb3 = false;
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, lb2, lb3, lb4, fb0);
}
    Output.points[8][0] += fd1;
    Output.points[8][1] += ld0;
    Thought lo5 = Thought28.getInstance(ao1, ao2, ao3, ao4, fb1, lb1, lb2, lb3);
    Thought lo6 = Thought94.getInstance(fd0, fd1, ld0, fd0);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
if(ao4 != null){
      ao4.m3(lb4, fb0, fb1, lb1);
}
    Thought lo7 = Thought81.getInstance();
    double ld8 = 162.30314644808553;
    Output.points[8][2] -= ld0;
    Thought lo9 = Thought87.getInstance(ld8, fd0, fd1, ld0, lb2, lb3, lb4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ld8 = fd0 - fd1;

Thought.STACK_COUNTER++;
return ld0;
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
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      ao1.m1(lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = ad2 < ad3;
    ad4 *= -1;
if(ao4 != null){
      ao4.m2(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    fb1 = ad2 < ad3;
    lb0 = fb0 && fb1;
    lb0 = fb0 || fb1;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
    lb0 = ad3 < ad4;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}

Thought.STACK_COUNTER++;
return ad3;
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
    double ld1 = 314.78164143531524;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ab4 = ao2.m2(fb0, fb1, lb0, ab1);
}
if(ao3 != null){
      ab2 = ao3.m2();
}
    fd0 = fd1 + ld1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    ab3 = ab4 && fb0;
    boolean lb2 = false;

Thought.STACK_COUNTER++;
return ld1;
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
    ab1 = ab2 && ab3;
    Thought lo0 = Thought42.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, ad1, ad2, ad3);
}
    fb1 = ad4 < fd0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
    lb1 = ab1 || ab2;
    double ld2 = 948.7470843758022;
    Thought lo3 = Thought9.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad3 = ad4 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(ld2, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
}
    ab4 = ad4 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld2, ad1, ad2, ad3, fb0, fb1, lb1, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb4 = true;
    lb1 = lb4 && ab1;

Thought.STACK_COUNTER++;
return ad4;
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
    double ld0 = 584.9421619520722;
    fd0 = fd1 - ld0;
    boolean lb1 = false;
    Output.points[8][3] += fd0;
    fb0 = fd1 > ld0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(fd0, fd1, ld0, fd0);
}
        fd1 = ld0 + fd0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
        lb1 = !fb0;
        fb1 = ld0 < fd0;
        lb1 = fb0 || fb1;
        fd1 *= -1;
        boolean lb2 = true;
if(fo1 != null){
          ld0 = fo1.m3(lb2, lb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          lb2 = fo0.m2(fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb2);
}
if(fo1 != null){
          lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        boolean lb3 = false;
        lb1 = fd1 < ld0;
        double ld4 = 72.06902834535761;
        fb0 = fb1 && lb2;
        Output.points[8][4] -= ld0;
        Output.points[8][5] -= fd0;
        fd1 = ld4 + ld0;
        Thought lo5 = Thought46.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld4, ld0, lb3, lb1, fb0, fb1);
if(fo0 != null){
          lb2 = fo0.m2(fo1, fo0, fo1, fo0, lb3, lb1, fb0, fb1);
}
        Thought lo6 = Thought80.getInstance(fd0, fd1, ld4, ld0);
        lb2 = lb3 || lb1;
}
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought90.getInstance(ab2, ab3, ab4, fb0);
    fd0 *= -1;
    Thought lo1 = Thought1.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
    double ld3 = 849.4880027733276;
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, fb0, fb1, lb2, ab1);
}
    if (ab2) {
        ab3 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb2);
}
if(fo0 != null){
          fo1 = fo0.m4(ld3, fd0, fd1, ld3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0);
}
        fd1 = ld3 + fd0;
        ab1 = fd1 < ld3;
        ab2 = ab3 || ab4;
        Thought lo4 = Thought29.getInstance(fb0, fb1, lb2, ab1);
        ab2 = fd0 < fd1;
        ld3 *= -1;
        Output.points[8][6] += fd0;
        ab3 = !ab4;
        boolean lb5 = true;
        ab4 = fd1 > ld3;
        fd0 = fd1 - ld3;
        double ld6 = 781.3363295587434;
        double ld7 = 571.9466354884833;
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3();
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 - ad2;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    boolean lb0 = false;
    ad4 *= -1;

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
if(fo0 != null){
      ab2 = fo0.m2(ad1, ad2, ad3, ad4);
}
    ab3 = ab4 && fb0;
    Output.points[8][7] -= fd0;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
    Output.points[8][8] -= ad1;
    fb0 = fb1 && lb0;
    ab1 = ad2 < ad3;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = !ab1;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 *= -1;
    ad4 = fd0 + fd1;
    boolean lb1 = false;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, lb1, ab1);
}
    Thought lo2 = Thought0.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    fb1 = fd1 < ad1;

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
    double ld0 = 789.4025459118259;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
    fb0 = !fb1;
    Thought lo1 = Thought9.getInstance(fb0, fb1, fb0, fb1);
    Output.points[0][0] += fd1;
if(ao2 != null){
      fb0 = ao2.m2();
}
    boolean lb2 = true;
    ld0 = fd0 + fd1;
    Output.points[0][1] += ld0;
    fb0 = fb1 || lb2;
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao3.m1(ld0, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
}
    boolean lb3 = false;

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
    Output.points[0][2] += ad2;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    Output.points[0][3] += ad2;
    ad3 = ad4 - fd0;
    Thought lo1 = Thought18.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
    fb1 = lb0 || fb0;
    boolean lb2 = true;
    fb0 = fd1 < ad1;
if(ao4 != null){
      ad2 = ao4.m3(ad3, ad4, fd0, fd1);
}
    fb1 = lb0 && lb2;
    fb0 = ad1 > ad2;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    Thought lo3 = Thought28.getInstance(fb1, lb0, lb2, fb0);
    boolean lb4 = false;

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
    ab2 = fd0 > fd1;
    Output.points[0][4] += fd0;
    ab3 = ab4 && fb0;
    fb1 = fd1 < fd0;
    boolean lb0 = true;
    lb0 = fd1 < fd0;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    lb1 = ab1 && ab2;
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought50.getInstance(ao2, ao3, ao4, fo0);
    ab1 = !ab2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    boolean lb1 = false;
    fd0 *= -1;
        fd1 *= -1;
    Thought lo2 = Thought43.getInstance(fo1, ao1, ao2, ao3, lb1, ab1, ab2, ab3);
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}
    ab1 = ad4 < fd0;
    fd1 = ad1 - ad2;
    if (ab2) {
        ab3 = ad3 < ad4;
if(ao2 != null){
          ao1 = ao2.m4();
}
        ab4 = fd0 < fd1;
if(ao4 != null){
          ao3 = ao4.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb1, ab1);
}
        Thought lo3 = Thought87.getInstance(fo0, fo1, ao1, ao2);
}
Thought.STACK_COUNTER++;
return ao3;
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
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    Output.points[0][5] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    lb0 = fd0 < fd1;
    fb0 = fb1 && lb0;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb0, fb0);
}
        boolean lb1 = true;
if(fo0 != null){
      fo0.m1();
}
    Output.points[0][6] -= fd0;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    lb1 = fd0 < fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
    lb0 = !lb1;
    lb2 = fd1 > fd0;
    fb0 = fd1 < fd0;

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
    boolean lb0 = false;
    fd1 *= -1;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    fb0 = !fb1;
    lb0 = fd0 > fd1;
    boolean lb2 = true;
    Output.points[0][7] -= fd0;
    boolean lb3 = true;
    Output.points[0][8] += fd1;
    Thought lo4 = Thought71.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb5 = false;
    lb1 = fd0 > fd1;

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
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2();
}
    Thought lo0 = Thought52.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Output.points[1][0] += fd0;
    fd1 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    Thought lo1 = Thought71.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    fd1 = fd0 - fd1;
    Thought lo3 = Thought13.getInstance();
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    Thought lo4 = Thought87.getInstance(fd1, fd0, fd1, fd0, fb1, lb2, fb0, fb1);
        lb2 = fd1 < fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Thought lo5 = Thought70.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb2, fb0);
    fb1 = fd1 < fd0;
    boolean lb6 = false;

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
