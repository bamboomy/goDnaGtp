package genetic;
import java.util.ArrayList;
class Thought52 extends Thought{
private static ArrayList<Thought52> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 55.457367748971535;
private double fd1 = 365.29707121452395;
private Thought fo0 = null;
private Thought fo1 = null;
Thought52 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought52 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought52 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought52 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought52 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought52 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought52 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought52 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought52 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = false;
    double ld1 = 53.32619920373451;
    ld1 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd0 = fo1.m3();
}
        Output.points[0][2] += fd1;
        fb0 = ld1 > fd0;
        boolean lb2 = true;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
        fb0 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb2, lb0, fb0);
}
        double ld3 = 578.0332447894974;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ld3, ld1, fd0, fd1);
}
        fb1 = ld3 > ld1;
        lb2 = lb0 && fb0;
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
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    fd0 = fd1 + fd0;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    Thought lo0 = Thought0.getInstance(fo0, fo1, fo0, fo1);
    Output.points[0][3] += fd1;
    ab3 = !ab4;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
        fd0 = fd1 - fd0;
        Thought lo1 = Thought97.getInstance();
        fd1 = fd0 - fd1;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    ad2 *= -1;
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    fb0 = ad3 > ad4;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fb0 && fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 - fd0;
    fb1 = lb0 || fb0;

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
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ad1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    double ld0 = 974.7931291427221;
    Thought lo1 = Thought35.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    if (ab1) {
        if (ab2) {
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, ab3, ab4, fb0, fb1);
}
            ad3 = ad4 - fd0;
            fd1 = ld0 - ad1;
            ab1 = !ab2;
            ab3 = ab4 && fb0;
            double ld2 = 570.1174071175583;
if(fo1 != null){
              fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
            boolean lb3 = false;
            boolean lb4 = false;
            ab3 = ad1 < ad2;
            Output.points[0][4] += ad3;
            ad4 *= -1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = !fb1;
    double ld0 = 771.4500098939147;
    fb0 = fb1 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, fd0, fd1);
}
    fb1 = ld0 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
    fb0 = fb1 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 - fd0;
    fd1 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought38.getInstance(fo1, ao1, ao2, ao3);
if(fo0 != null){
      ao4 = fo0.m4(ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
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
    Output.points[0][5] += ad2;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m3(ad3, ad4, fd0, fd1);
}
    fb1 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
    double ld0 = 736.7619893970497;
    Output.points[0][6] -= fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Thought lo2 = Thought15.getInstance(ld0, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
    boolean lb3 = true;
    ad4 = fd0 - fd1;
    Thought lo4 = Thought21.getInstance();
    lb3 = !fb0;
    fb1 = lb1 && lb3;
    Thought lo5 = Thought59.getInstance(ld0, ad1, ad2, ad3);
if(ao4 != null){
      ao4.m3(fb0, fb1, lb1, lb3);
}
    ad4 = fd0 - fd1;
    double ld6 = 702.830824147187;

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
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    double ld1 = 784.966168315491;
    ab4 = ld1 > fd0;
    boolean lb2 = true;
    fd1 = ld1 + fd0;
    fd1 = ld1 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    ld1 = fd0 - fd1;
    double ld3 = 348.17608791744;
    lb2 = ab1 && ab2;
if(fo0 != null){
      fo0.m1(ld1, ld3, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld4 = 345.62072959159553;
    ld1 *= -1;
if(fo1 != null){
      fo1.m2();
}
    lb0 = !lb2;
    Output.points[0][7] += ld3;
    ab1 = !ab2;
if(ao1 != null){
      ab3 = ao1.m2(ld4, fd0, fd1, ld1);
}
    double ld5 = 747.5053636685758;
    ab4 = fb0 && fb1;
    lb0 = lb2 || ab1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    ld3 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld4, ld5, fd0, fd1);
}
    fb1 = ld1 < ld3;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    double ld0 = 40.227634637270796;
    ab4 = ld0 > ad1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 *= -1;
    ab4 = fb0 || fb1;
    Thought lo1 = Thought49.getInstance(ld0, ad1, ad2, ad3);
    ad4 = fd0 + fd1;
    ld0 = ad1 + ad2;
    ad3 *= -1;

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
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought66.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
    double ld1 = 132.66121933241484;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[0][8] -= fd0;
    fb0 = fd1 < ld1;
    fb1 = fd0 < fd1;
    Thought lo2 = Thought55.getInstance(fo1, fo0, fo1, fo0);
    ld1 = fd0 + fd1;
    fb0 = ld1 < fd0;
    boolean lb3 = false;
    double ld4 = 174.99637383364322;
    fb0 = fd0 > fd1;
    fb1 = ld1 < ld4;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld1, ld4, lb3, fb0, fb1, lb3);
}
if(fo0 != null){
      fo0.m1();
}
    Thought lo5 = Thought40.getInstance(fd0, fd1, ld1, ld4);
    fb0 = fb1 && lb3;
    fd0 = fd1 + ld1;
    ld4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb3, fb0);
}
    Output.points[1][0] -= fd0;
    Output.points[1][1] -= fd1;
    Output.points[1][2] += ld1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld1);
}
    ld4 = fd0 + fd1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought88.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    Thought lo2 = Thought60.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
}
        Output.points[1][3] -= fd1;
    ab2 = !ab3;
    ab4 = !fb0;
if(fo0 != null){
      fo0.m2();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;

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
if(fo0 != null){
      ad2 = fo0.m3(fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    ad4 *= -1;
    fb0 = fb1 && lb0;
    fb0 = fd0 > fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 || fb0;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    Thought lo1 = Thought91.getInstance();
    fb0 = !fb1;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
        ad2 = ad3 - ad4;
if(fo1 != null){
          fd0 = fo1.m3(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    boolean lb2 = true;
    lb2 = fd1 < ad1;

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
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ab2 = ad1 < ad2;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ad2 *= -1;
    ad3 = ad4 - fd0;
    ab1 = !ab2;
    boolean lb0 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought8.getInstance(fo0, fo1, fo0, fo1);
    Thought lo2 = Thought48.getInstance(ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
if(fo0 != null){
      fo0.m1();
}
    Thought lo3 = Thought26.getInstance(fd0, fd1, ad1, ad2);
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    lb0 = !ab1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][4] -= fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    double ld0 = 105.875271425209;
    Thought lo1 = Thought17.getInstance(fo1, ao1, ao2, ao3);
    fb1 = ld0 < fd0;
    boolean lb2 = true;
    fd1 = ld0 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb2);
}
    ld0 = fd0 - fd1;
    fb0 = ld0 > fd0;
    fd1 = ld0 - fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = lb2 || fb0;
if(ao2 != null){
      fd1 = ao2.m3(ld0, fd0, fd1, ld0);
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb2, fb0, fb1);
}
    lb2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
        fb0 = !fb1;
    ad2 = ad3 - ad4;
    double ld0 = 538.0446828936686;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    ad4 *= -1;
    fb0 = fb1 || fb0;
    fd0 = fd1 - ld0;
    double ld1 = 835.2091998073715;

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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
if(ao4 != null){
      fb1 = ao4.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    ab1 = ab2 && ab3;
    Thought lo0 = Thought36.getInstance(ab4, fb0, fb1, ab1);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought70.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = fd0 < fd1;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    double ld2 = 806.1476492724872;
    double ld3 = 793.3622370243968;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab1 = ab2 || ab3;
    boolean lb0 = true;
if(ao1 != null){
      ab3 = ao1.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    double ld1 = 211.1441702737101;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    boolean lb2 = true;
    lb0 = ad4 > fd0;
    boolean lb3 = true;
if(ao2 != null){
      fd1 = ao2.m3();
}
    Thought lo4 = Thought98.getInstance(ld1, ad1, ad2, ad3);
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 + fd1;
if(ao4 != null){
          ao3 = ao4.m4(lb2, lb3, ab1, ab2);
}
        boolean lb5 = false;
        boolean lb6 = false;
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 963.4323065025643;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought91.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fd1 = fo0.m3();
}
if(fo1 != null){
      fb0 = fo1.m2(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought78.getInstance(fo0, fo1, fo0, fo1);
    Thought lo2 = Thought5.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought17.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fb0 = !fb1;
    lb0 = fd1 > fd0;
    double ld4 = 559.3599845764588;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[1][5] += fd1;
    Thought lo5 = Thought69.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ad1;
    ad2 *= -1;
    double ld0 = 605.7607743187579;
    fb0 = fb1 || fb0;
    ad2 *= -1;
    boolean lb1 = true;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ld0);
}
    ad1 = ad2 + ad3;
    fb0 = ad4 > fd0;
if(fo0 != null){
      fb1 = fo0.m2(lb1, fb0, fb1, lb1);
}
    Output.points[1][6] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    lb1 = !fb0;
    ld0 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    Output.points[1][7] += fd1;
    lb1 = ld0 < ad1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = ad2 > ad3;
    fb1 = lb1 && fb0;
    ad4 = fd0 + fd1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought74.getInstance(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
if(fo1 != null){
      fo1.m3();
}
    ab4 = fb0 && fb1;
    lb0 = fd1 < ad1;
    ab1 = ad2 > ad3;
    boolean lb2 = false;
    ad4 *= -1;
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb2);
}
    ab1 = ad3 < ad4;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought20.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    Output.points[1][8] -= fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
    fb0 = fd1 < fd0;
if(ao1 != null){
      ao1.m3();
}
    fd1 = fd0 + fd1;
    boolean lb1 = false;

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
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao3.m3(fb1, fb0, fb1, fb0);
}
    double ld0 = 239.8004552015495;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ad1);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
          ao4.m3(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        Thought lo1 = Thought91.getInstance();
        fb1 = ad3 > ad4;
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought50.getInstance(ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb1 = !ab1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought49.getInstance(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ab4 = fd0 < fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1();
}
    boolean lb2 = false;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, lb2);
}
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    fd1 = fd0 - fd1;
    Thought lo3 = Thought76.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    fb1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb2);
}
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Thought lo4 = Thought10.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);

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
    Thought lo0 = Thought93.getInstance();
    ad1 = ad2 + ad3;
    ab1 = ad4 < fd0;
    ab2 = ab3 || ab4;
    fd1 = ad1 - ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 > ad2;
    fb1 = !ab1;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
    fd1 = ad1 + ad2;
    Output.points[2][0] -= ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ad2 = ad3 + ad4;
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ad3 = ao4.m3(lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 && ab4;

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
    if (fb0) {
        fb1 = !fb0;
        fb1 = fb0 || fb1;
        fb0 = fb1 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fd0 *= -1;
        fd1 = fd0 - fd1;
        fb1 = !fb0;
if(fo1 != null){
          fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fb0 = fo0.m2();
}
        Output.points[2][1] += fd0;
        if (fb1) {
if(fo0 != null){
              fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
            fb0 = fb1 && fb0;
            boolean lb0 = false;
if(fo0 != null){
              fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
            fd1 = fd0 - fd1;
}}
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
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab1 = ab2 || ab3;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld0 = 577.5775775769266;
    Output.points[2][2] -= ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    fd1 = ld0 + fd0;
    ab4 = !fb0;
    fb1 = fd1 > ld0;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        fb1 = fd1 > ld0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ab1 = fo1.m2(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2();
}
        if (ab1) {
            fd1 *= -1;
}}
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
    fb1 = fb0 || fb1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    Output.points[2][3] += ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    Output.points[2][4] += ad4;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
        fb1 = !fb0;
    fd0 = fd1 - ad1;
    boolean lb0 = false;
    boolean lb1 = false;
    if (lb1) {
        fb0 = !fb1;
        lb0 = ad2 < ad3;
        lb1 = fb0 || fb1;
        ad4 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}
        lb0 = lb1 && fb0;
        fb1 = lb0 && lb1;
        Output.points[2][5] -= fd0;
        Thought lo2 = Thought40.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
        double ld3 = 705.8124264088938;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 + ad4;
    ab1 = ab2 || ab3;
    boolean lb0 = true;
    Output.points[2][6] += fd0;
    Output.points[2][7] -= fd1;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = lb0 || ab1;
    ab2 = fd0 > fd1;
    double ld1 = 201.5852136115916;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 933.4803340842043;
    fb1 = ld1 < ld2;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    Output.points[2][8] -= fd0;
    Thought lo3 = Thought17.getInstance(lb0, ab1, ab2, ab3);
    double ld4 = 831.8696750403597;
    Output.points[3][0] += fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought22.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought28.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    double ld2 = 239.36986518938997;
if(ao3 != null){
      ld2 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld2, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought28.getInstance();
    fb0 = fb1 || fb0;
    fd1 = ld2 + fd0;
    Thought lo4 = Thought61.getInstance(fd1, ld2, fd0, fd1);
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    ld2 = fd0 + fd1;
    boolean lb5 = false;
    if (lb5) {
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld2);
}
        boolean lb6 = false;
        boolean lb7 = true;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[3][1] += fd1;
    double ld0 = 755.9584073374269;
    boolean lb1 = false;
    boolean lb2 = false;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb1);
}
    boolean lb3 = true;
    Thought lo4 = Thought48.getInstance(ao1, ao2, ao3, ao4);
    lb2 = lb3 && fb0;
    double ld5 = 459.4730407500029;
    Output.points[3][2] += ld0;
    fb1 = lb1 || lb2;
    boolean lb6 = true;
if(fo0 != null){
      fo0.m2(ld5, ad1, ad2, ad3, lb3, lb6, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    lb1 = ad4 > fd0;
    boolean lb7 = false;
    lb2 = fd1 < ld0;
    Output.points[3][3] += ld5;
    lb3 = ad1 > ad2;
    ad3 *= -1;
    Output.points[3][4] += ad4;
    lb6 = fd0 > fd1;

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
    if (ab1) {
        boolean lb0 = true;
if(ao1 != null){
          fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
          lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        double ld1 = 664.738856204008;
        Output.points[3][5] -= fd0;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, ab1, ab2);
}
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
        ab3 = ld1 < fd0;
if(ao1 != null){
          fo1 = ao1.m4(fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb0);
}
        Thought lo2 = Thought74.getInstance();
if(ao2 != null){
          ab1 = ao2.m2(ld1, fd0, fd1, ld1);
}
if(ao3 != null){
          ab2 = ao3.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0);
}
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1, lb0, ab1, ab2, ab3);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought27.getInstance(ao2, ao3, ao4, fo0);
    ab4 = fb0 && fb1;
    lb0 = ab1 || ab2;
    boolean lb2 = true;
if(fo1 != null){
      ab2 = fo1.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    boolean lb3 = false;
    Thought lo4 = Thought81.getInstance();
    fd0 = fd1 + ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    Output.points[3][6] += fd1;
    lb0 = !lb2;
    boolean lb5 = false;
    Thought lo6 = Thought28.getInstance(lb3, lb5, ab1, ab2);
    if (ab3) {
        ab4 = fb0 || fb1;
if(ao3 != null){
          ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, lb0, lb2, lb3, lb5);
}
        ab1 = ab2 || ab3;
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
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][7] -= fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 409.7761451533429;
    double ld1 = 736.0329791905543;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = ld1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = !fb0;
    fb1 = fd1 < ld0;
    Output.points[3][8] -= ld1;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, ld1);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
        fd1 *= -1;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
    ld0 *= -1;
    fb0 = fb1 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
}
    ld1 *= -1;
    fd0 = fd1 - ld0;

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
    Thought lo0 = Thought16.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Output.points[4][0] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    double ld1 = 259.85818989892016;
    Output.points[4][1] += fd0;
    fb1 = fd1 > ld1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(ld1, fd0, fd1, ld1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    boolean lb2 = true;
    Output.points[4][2] += fd0;
if(fo0 != null){
      fo0.m1(fb0, fb1, lb2, fb0);
}
    Output.points[4][3] -= fd1;
    ld1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    Thought lo3 = Thought31.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, lb2, fb0, fb1);

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
