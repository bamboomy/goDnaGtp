package genetic;
import java.util.ArrayList;
class Thought34 extends Thought{
private static ArrayList<Thought34> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 235.9350336683546;
private double fd1 = 651.5334190694534;
private Thought fo0 = null;
private Thought fo1 = null;
Thought34 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought34 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought34 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought34 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought34 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought34 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought34 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought34 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought34 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought66.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    fd0 *= -1;
    Thought lo1 = Thought94.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought42.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    Thought lo3 = Thought41.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Thought lo4 = Thought88.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    fb1 = ab1 && ab2;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        ab3 = ab4 && fb0;
        fb1 = !ab1;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = fd0 - fd1;
if(fo1 != null){
          fd0 = fo1.m3();
}
        fb1 = fd1 > fd0;
        Output.points[4][8] += fd1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fd1 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
        Output.points[5][0] -= fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        }
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(fo0 != null){
      ab4 = fo0.m2();
}
    fb0 = fd1 < fd0;
    fb1 = ab1 || ab2;

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
    ad2 *= -1;
    ad3 = ad4 - fd0;
    double ld0 = 414.3287605167886;
    boolean lb1 = true;
        fd0 = fd1 - ld0;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
    lb1 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb1, fb0, fb1);
}
    boolean lb2 = false;
    Thought lo3 = Thought6.getInstance(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, lb1, lb2, fb0, fb1);
}
    double ld4 = 118.09956005756672;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld5 = 304.90166737794016;
    Thought lo6 = Thought80.getInstance(ld4, ld5, ad1, ad2, lb1, lb2, fb0, fb1);
    double ld7 = 528.4689720113372;
    lb1 = lb2 || fb0;
if(fo0 != null){
      fb1 = fo0.m2();
}
    double ld8 = 977.3554963112442;
    boolean lb9 = true;
    boolean lb10 = true;
    Thought lo11 = Thought44.getInstance(ad1, ad2, ad3, ad4);

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
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought89.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    ad3 *= -1;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2, lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought30.getInstance();
    Output.points[5][1] -= ad3;
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1);
}
    boolean lb3 = false;
    ad2 *= -1;
if(fo0 != null){
      fo0.m1(ab3, ab4, fb0, fb1);
}
    ad3 = ad4 + fd0;
    double ld4 = 289.99728974612026;
    lb1 = lb3 && ab1;
    Output.points[5][2] += fd0;

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
    fb1 = fd0 > fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    double ld0 = 743.7300527521212;
    Output.points[5][3] += fd0;
    double ld1 = 205.78486616754273;
    fd0 *= -1;
        fb0 = fb1 || fb0;
    fb1 = !fb0;
    double ld2 = 183.81837430924068;
    Thought lo3 = Thought21.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ld2 = fo1.m3();
}
    fd0 = fd1 + ld0;
    ld1 = ld2 - fd0;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    boolean lb4 = true;
    Thought lo5 = Thought71.getInstance(fd1, ld0, ld1, ld2);
    fd0 = fd1 - ld0;
    boolean lb6 = false;
if(ao2 != null){
      ao1 = ao2.m4(lb6, fb0, fb1, lb4);
}
    ld1 = ld2 - fd0;

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
    fb1 = fb0 && fb1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
    fd0 *= -1;
    boolean lb0 = false;
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        Output.points[5][4] += ad4;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, lb0, lb1, fb0, fb1);
}
        lb0 = lb1 && fb0;
        Thought lo2 = Thought45.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
          fd0 = ao3.m3(fd1, ad1, ad2, ad3, fb1, lb0, lb1, fb0);
}
if(ao4 != null){
          ao4.m2();
}
        }
    Thought lo3 = Thought59.getInstance(ad4, fd0, fd1, ad1);
    Thought lo4 = Thought88.getInstance(fb1, lb0, lb1, fb0);
    fb1 = lb0 || lb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    Output.points[5][5] += fd1;
    Thought lo5 = Thought89.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
    boolean lb6 = true;
if(ao3 != null){
      lb6 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
    if (lb6) {
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
if(ao3 != null){
          ad3 = ao3.m3();
}
        double ld7 = 641.9480906779474;
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
    ab1 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
    double ld0 = 195.70016984881227;
    if (fb1) {
if(fo1 != null){
          ab1 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0);
}
        ab2 = !ab3;
        double ld1 = 32.305972369331094;
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld1, ld0, fd0, ab4, fb0, fb1, ab1);
}
        ab2 = ab3 || ab4;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fd1 > ad1;
if(ao3 != null){
      ad2 = ao3.m3();
}
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ad1);
}
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
}
    ad2 *= -1;
    ab1 = ad3 < ad4;
    Output.points[5][6] -= fd0;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;

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
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought38.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 782.8215597336023;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = ld1 > fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld1, fd0, fd1);
}
    fb0 = ld1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ld1;
    boolean lb2 = true;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    fb0 = !fb1;
    Thought lo3 = Thought35.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, lb2, fb0, fb1, lb2);
    fb0 = ld1 < fd0;
    Output.points[5][7] -= fd1;
    double ld4 = 816.3059697706318;
    ld1 = ld4 + fd0;
    for(int i0=0; i0<10; i0++){
        if (fb1) {
if(fo1 != null){
              fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
}
            fb0 = !fb1;
}}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = ab1 || ab2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2();
}
    fd0 = fd1 - fd0;
    boolean lb1 = true;
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      lb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld2 = 132.0546764513358;
    fb0 = fd0 > fd1;

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
    Output.points[5][8] -= ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought80.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    double ld1 = 823.580108555834;
    Thought lo2 = Thought92.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    if (fb1) {
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
    boolean lb0 = true;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought73.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
    ab2 = fd0 > fd1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 *= -1;
    double ld2 = 551.9581930192674;
    Thought lo3 = Thought56.getInstance(ad4, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
    Thought lo4 = Thought67.getInstance();
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
    lb0 = ab1 || ab2;
    ab3 = ab4 || fb0;
    fb1 = lb0 && ab1;
    Thought lo5 = Thought77.getInstance(ab2, ab3, ab4, fb0);
    fd0 = fd1 + ld2;
    Thought lo6 = Thought76.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);

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
    fb0 = !fb1;
    fb0 = !fb1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought59.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
    double ld1 = 939.7946025065726;
    fb0 = fb1 || fb0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    fb1 = !fb0;
    fb1 = !fb0;
if(ao3 != null){
      fb1 = ao3.m2(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
        double ld2 = 343.19857628867175;
    fb0 = ld2 < fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 > ld1;
    double ld3 = 619.2819557566373;
    Thought lo4 = Thought41.getInstance(ld2, ld3, fd0, fd1);
    ld1 = ld2 + ld3;
    fb1 = fd0 < fd1;
    ld1 = ld2 - ld3;
    Output.points[6][0] -= fd0;
    fb0 = fd1 < ld1;

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
if(ao2 != null){
      ao2.m2(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    ad2 = ad3 - ad4;
    lb0 = fd0 < fd1;
    Output.points[6][1] += ad1;
    double ld1 = 514.4342568715015;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    lb0 = fb0 || fb1;
    lb0 = fb0 && fb1;
    lb0 = !fb0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Output.points[6][2] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    boolean lb1 = false;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    ab3 = ab4 || fb0;
    Output.points[6][3] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, lb1, ab1);
}
        ab2 = ab3 || ab4;
    fb0 = fb1 || lb0;
    for(int i0=0; i0<10; i0++){
        lb1 = ab1 && ab2;
        ab3 = !ab4;
        fd1 = fd0 - fd1;
        fb0 = fb1 || lb0;
        lb1 = ab1 && ab2;
        fd0 *= -1;
        ab3 = fd1 > fd0;
        Thought lo2 = Thought64.getInstance(ao1, ao2, ao3, ao4);
        double ld3 = 508.7350381218868;
        ab4 = fd0 < fd1;
        double ld4 = 224.65116083736845;
        if (fb0) {
            Thought lo5 = Thought41.getInstance(ld3, ld4, fd0, fd1, fb1, lb0, lb1, ab1);
            ab2 = ld3 > ld4;
if(fo0 != null){
              fo0.m3();
}
}}
Thought.STACK_COUNTER++;
return ab3;
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
    double ld0 = 962.1032495423395;
    if (ab2) {
        ld0 = ad1 + ad2;
        ad3 *= -1;
        ad4 = fd0 - fd1;
        Thought lo1 = Thought16.getInstance(ld0, ad1, ad2, ad3);
if(ao3 != null){
          ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
        ad4 = fd0 + fd1;
        Thought lo2 = Thought52.getInstance(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3);
if(ao2 != null){
          ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
        boolean lb3 = false;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb3);
}
        boolean lb4 = false;
        ad2 *= -1;
        boolean lb5 = false;
        lb4 = lb5 || ab1;
        ad3 = ad4 - fd0;
        boolean lb6 = true;
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4);
}
        if (ab1) {
            ab2 = fd1 < ld0;
if(fo0 != null){
              ab3 = fo0.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb3);
}
            fd0 = fd1 + ld0;
if(ao1 != null){
              fo1 = ao1.m4();
}
}}
Thought.STACK_COUNTER++;
return ab2;
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
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    double ld0 = 99.18448826426118;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    double ld1 = 91.772049701477;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
}
    ld1 = fd0 + fd1;
    fb0 = !fb1;
    ld0 = ld1 + fd0;
    fb0 = !fb1;
    fb0 = fd1 < ld0;
    Thought lo2 = Thought53.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    Thought lo3 = Thought31.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld1 = fd0 - fd1;
    boolean lb4 = false;
    double ld5 = 569.5792456323406;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought62.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fb1 = !ab1;
    Output.points[6][4] += fd1;
    ab2 = !ab3;
    ab4 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[6][5] -= fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    lb2 = ab1 || ab2;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb1, lb2, ab1);
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
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    fd0 = fd1 + ad1;
    lb0 = fb0 || fb1;
    ad2 = ad3 - ad4;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
    boolean lb2 = false;
    lb0 = ad2 > ad3;
    boolean lb3 = false;
    ad4 = fd0 - fd1;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld4 = 15.412461959779789;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld4, lb3, fb0, fb1, lb0);
}
    lb1 = ad1 < ad2;
    ad3 *= -1;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ld4, lb1, lb2, lb3, fb0);
}
    fb1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[6][6] -= ad3;
    ad4 = fd0 - fd1;
    ld4 *= -1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld4, ad1);
}
    Output.points[6][7] += ad2;

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
        double ld0 = 187.62926910929176;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, ab4, fb0, fb1, lb1);
}
    Thought lo2 = Thought95.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 + fd0;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2, ab4, fb0, fb1, lb1);
}
    ad3 *= -1;
    lb3 = ad4 < fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        boolean lb0 = true;
    double ld1 = 257.2589400566471;
    Thought lo2 = Thought2.getInstance(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1);
    boolean lb3 = true;
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0, lb0, lb3, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, lb0, lb3, fb0, fb1);
}
    lb0 = fd1 > ld1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    double ld4 = 451.48539917979514;
    lb3 = fb0 && fb1;

Thought.STACK_COUNTER++;
return ld4;
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
    ad1 = ad2 - ad3;
if(ao1 != null){
      fb0 = ao1.m2(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
    Output.points[6][8] -= ad4;
    fb0 = fd0 > fd1;
    boolean lb0 = true;
    fb0 = ad1 < ad2;
if(ao2 != null){
      fb1 = ao2.m2();
}
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
    Output.points[7][0] -= ad1;
    lb0 = !lb1;
    ad2 *= -1;
    fb0 = ad3 < ad4;
        fb1 = lb0 || lb1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fd0 = fo0.m3(lb1, fb0, fb1, lb0);
}
    Thought lo2 = Thought29.getInstance(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb0);
}
    ad2 = ad3 + ad4;
    lb1 = fd0 > fd1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
}

Thought.STACK_COUNTER++;
return ad1;
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
    Output.points[7][1] -= fd1;
    Thought lo0 = Thought59.getInstance(ao1, ao2, ao3, ao4);
    ab1 = ab2 || ab3;
    Output.points[7][2] -= fd0;
    ab4 = !fb0;
    boolean lb1 = false;
    Output.points[7][3] -= fd1;
    fb0 = fd0 > fd1;
    fd0 *= -1;
    fb1 = lb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    lb1 = fd1 > fd0;
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    Output.points[7][4] -= ad4;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    ab2 = ab3 || ab4;
    double ld0 = 630.0458580432844;
if(ao3 != null){
      ld0 = ao3.m3(fb0, fb1, ab1, ab2);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3);
}
        Thought lo1 = Thought55.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
    double ld2 = 369.5847634099394;
    ab1 = ab2 || ab3;
    ab4 = ld2 > ad1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    boolean lb3 = true;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ld0;
    for(int i0=0; i0<10; i0++){
        ab3 = ld2 > ad1;
        ab4 = fb0 || fb1;
        lb3 = !ab1;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld0 = 272.5174846268868;
    Thought lo1 = Thought44.getInstance();
    fb0 = ld0 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
    fb1 = fb0 || fb1;
    ld0 = fd0 - fd1;

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
    Output.points[7][5] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    ab1 = fd1 < fd0;
    ab2 = !ab3;
    fd1 = fd0 + fd1;
    double ld1 = 72.53390274455563;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    ab1 = ld1 > fd0;
    Thought lo2 = Thought19.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ld1 = fo1.m3();
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      lb0 = fo0.m2(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fb1 = lb0 && ab1;
    Thought lo3 = Thought33.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
    fd1 *= -1;
    fb1 = ld1 > fd0;

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
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
    fb0 = ad2 < ad3;
    double ld0 = 399.01567061131743;
    double ld1 = 651.0315296125494;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    fb0 = ld0 < ld1;

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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][6] += ad1;
    ab2 = ad2 < ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab2 = fd0 < fd1;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought55.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
        boolean lb1 = false;
    fb0 = fd0 < fd1;
    fb1 = ad1 < ad2;

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
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 *= -1;
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao1 != null){
      lb0 = ao1.m2();
}
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    fb1 = lb0 || fb0;
    fb1 = fd0 > fd1;
    lb0 = !fb0;
    double ld1 = 694.4610174071814;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, fb0, fb1);
}
    boolean lb2 = false;
    lb0 = !lb2;
    double ld3 = 143.49142658894917;
    ld1 *= -1;
    ld3 = ad1 + ad2;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb0 = fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
        ld1 *= -1;
        ld3 = ad1 - ad2;
        }
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb0, lb2, fb0, fb1);
}
    boolean lb4 = false;
    ld1 = ld3 - ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, lb2, lb4, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    fb1 = ad2 > ad3;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = false;
if(ao1 != null){
      lb0 = ao1.m2(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ab4 = ao2.m2();
}
    boolean lb2 = true;
    Output.points[7][7] += fd1;
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0);
}
    Output.points[7][8] += fd1;
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb1, lb2, ab1, ab2);
}
    Output.points[8][0] += fd0;
    fd1 *= -1;
    boolean lb3 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb1 = lb0 || lb1;
if(ao3 != null){
          lb2 = ao3.m2(fd1, fd0, fd1, fd0, lb3, ab1, ab2, ab3);
}
    if (ab4) {
        fb0 = fd1 < fd0;
        fd1 *= -1;
        fb1 = fd0 > fd1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1();
}
    boolean lb0 = false;
    lb0 = !ab1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ab2 = ao2.m2(ad1, ad2, ad3, ad4);
}
    ab3 = fd0 < fd1;
    ad1 *= -1;
    boolean lb1 = true;
    ab3 = ab4 || fb0;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, lb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
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
    double ld0 = 376.8594284924201;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 > fd1;
    Thought lo2 = Thought28.getInstance(ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
if(fo0 != null){
          fo0.m1();
}
    lb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    fd0 = fd1 - ld0;
    boolean lb3 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb1);
}
    Thought lo4 = Thought98.getInstance(fo1, fo0, fo1, fo0);
    fd1 = ld0 - fd0;
    Output.points[8][1] += fd1;
    boolean lb5 = true;
        Thought lo6 = Thought12.getInstance(ld0, fd0, fd1, ld0, lb3, lb5, fb0, fb1);
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      lb1 = fo0.m2(fd0, fd1, ld0, fd0);
}
    lb3 = fd1 > ld0;
    lb5 = fd0 > fd1;

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
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
    Output.points[8][2] -= fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought23.getInstance(fo0, fo1, fo0, fo1);
    Thought lo1 = Thought54.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 < fd0;
    boolean lb2 = true;
    fb0 = fd1 < fd0;
    fb1 = lb2 && fb0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    lb2 = !fb0;

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
    Output.points[8][3] -= fd0;
    Output.points[8][4] += fd1;
    Thought lo0 = Thought3.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
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
}
