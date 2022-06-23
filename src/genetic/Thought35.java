package genetic;
import java.util.ArrayList;
class Thought35 extends Thought{
private static ArrayList<Thought35> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 158.32827280068702;
private double fd1 = 765.0130995666955;
private Thought fo0 = null;
private Thought fo1 = null;
Thought35 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought35 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought35 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought35 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought35 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought35 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought35 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought35 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought35 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[7][4] -= fd0;
    double ld1 = 429.51256765787696;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2();
}
    boolean lb2 = false;
    lb2 = fd0 > fd1;
    Output.points[7][5] -= ld1;
        Thought lo3 = Thought34.getInstance(fd0, fd1, ld1, fd0, fb0, fb1, lb0, lb2);

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
    ab1 = !ab2;
    ab3 = fd0 > fd1;
    ab4 = fb0 && fb1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    fd1 *= -1;
    fd0 = fd1 - fd0;

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
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
        fb1 = lb0 || fb0;
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
        Thought lo2 = Thought49.getInstance(fd1, ad1, ad2, ad3);
        boolean lb3 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
        if (lb3) {
            fb0 = ad2 > ad3;
            fb1 = ad4 < fd0;
if(fo1 != null){
              fo0 = fo1.m4(lb0, lb1, lb3, fb0);
}
            fb1 = lb0 || lb1;
            lb3 = fb0 && fb1;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
          fo0.m3();
}
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    fd1 *= -1;

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
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 *= -1;
    fb1 = fd1 > fd0;
    boolean lb0 = true;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
    fb0 = !fb1;
    Thought lo1 = Thought0.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Output.points[7][6] -= fd0;
    fb1 = fd1 > fd0;
    lb0 = fd1 > fd0;
    fb0 = !fb1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    lb0 = fb0 && fb1;
    Thought lo2 = Thought53.getInstance(fd1, fd0, fd1, fd0);
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;
    double ld3 = 121.81564818218978;
    fd0 = fd1 + ld3;
    fb0 = fd0 > fd1;
    fb1 = ld3 < fd0;
    Thought lo4 = Thought68.getInstance(lb0, fb0, fb1, lb0);
    fb0 = fd1 > ld3;
    fd0 = fd1 + ld3;
    boolean lb5 = false;

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
if(ao1 != null){
      ad2 = ao1.m3();
}
    Thought lo0 = Thought23.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = !fb1;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
    fd1 = ad1 + ad2;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, lb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
    double ld2 = 318.7924574101933;
    double ld3 = 964.936956808814;
    lb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, ld3, ad1, ad2);
}
if(ao2 != null){
      ao2.m1(lb1, fb0, fb1, lb1);
}
    boolean lb4 = true;
    lb4 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo5 = Thought20.getInstance(ad3, ad4, fd0, fd1, lb1, lb4, fb0, fb1);
    if (lb1) {
        lb4 = ld2 < ld3;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        boolean lb6 = false;
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
    boolean lb0 = true;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;
    Output.points[7][7] -= fd1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
    Output.points[7][8] -= fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    double ld1 = 945.4048098555373;
    fb0 = fd0 < fd1;
    fb1 = !lb0;
    ld1 = fd0 - fd1;
if(fo0 != null){
      ld1 = fo0.m3(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld1;
    fb0 = fb1 || lb0;

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
    Thought lo0 = Thought35.getInstance();
    ad2 = ad3 + ad4;
    boolean lb1 = false;
    Output.points[8][0] += fd0;
    fd1 = ad1 + ad2;
    for(int i0=0; i0<10; i0++){
        ab1 = !ab2;
        boolean lb2 = false;
        ab2 = ab3 || ab4;
        Thought lo3 = Thought79.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, lb2, lb1);
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb2, lb1);
}
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
          ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb2, lb1);
}
        ab1 = ab2 && ab3;
        double ld4 = 798.3947834289825;
        Thought lo5 = Thought0.getInstance(ao1, ao2, ao3, ao4);
        fd0 = fd1 - ld4;
        Thought lo6 = Thought92.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb2);
        for(int i1=0; i1<10; i1++){
            boolean lb7 = true;
            fd0 = fd1 + ld4;
            ad1 = ad2 + ad3;
            for(int i2=0; i2<10; i2++){
                lb2 = ad4 < fd0;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][1] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb0 = fb0 || fb1;
if(fo0 != null){
      lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
if(fo1 != null){
      fo1.m3();
}
    fb0 = fd0 < fd1;
    fb1 = lb0 || fb0;
    Output.points[8][2] += fd0;
    fb1 = lb0 && fb0;
    Thought lo1 = Thought25.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    fd1 = fd0 + fd1;
    lb0 = !fb0;
    fd0 *= -1;
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb0, lb2, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Output.points[8][3] -= fd1;
    fd0 *= -1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}

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
    Thought lo0 = Thought86.getInstance(ab1, ab2, ab3, ab4);
    Output.points[8][4] += fd1;
    fb0 = fd0 > fd1;
    fd0 *= -1;
    double ld1 = 246.0628983587924;
    fd0 = fd1 - ld1;
    Output.points[8][5] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    ld1 = fd0 - fd1;
    ld1 *= -1;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld1, fd0, fb1, ab1, ab2, ab3);
}
    double ld2 = 748.9447860029081;
    ab4 = fd0 > fd1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    lb0 = ad2 < ad3;
    Thought lo1 = Thought15.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    boolean lb2 = true;
    double ld3 = 379.4248775866682;
    fb0 = fb1 && lb0;
    lb2 = fb0 || fb1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    Output.points[8][6] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = false;
    Thought lo1 = Thought83.getInstance(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    lb0 = fd0 < fd1;
    ab1 = ab2 && ab3;
    ab4 = !fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = ad1 > ad2;
        ad3 = ad4 - fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought72.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    double ld1 = 486.1593700569805;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
        ld1 = fd0 + fd1;
    ld1 *= -1;
    fb0 = fd0 > fd1;
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld1);
}
    boolean lb3 = true;
    lb3 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0);
}
    lb2 = fd1 > ld1;
if(ao2 != null){
      lb3 = ao2.m2(fb0, fb1, lb2, lb3);
}
    Thought lo4 = Thought73.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld1, fd0, fb0, fb1, lb2, lb3);
}
    fd1 = ld1 - fd0;
    double ld5 = 879.4746522941979;
    fd0 = fd1 - ld1;
    fb0 = fb1 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb3 = fb0 && fb1;
    Thought lo6 = Thought36.getInstance(fo0, fo1, ao1, ao2, ld5, fd0, fd1, ld1, lb2, lb3, fb0, fb1);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
        Output.points[8][7] += ad2;
        ad3 = ad4 + fd0;
        fb1 = !fb0;
if(ao1 != null){
          fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
        ad2 = ad3 + ad4;
if(ao3 != null){
          fb1 = ao3.m2();
}
if(ao4 != null){
          ao4.m2(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
        fb0 = ad3 < ad4;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        Thought lo0 = Thought4.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
        fb1 = ad3 < ad4;
        fb0 = fb1 || fb0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(ao1 != null){
      ab4 = ao1.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb0;
    Thought lo1 = Thought0.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    boolean lb2 = false;
    lb2 = ab1 && ab2;
    ab3 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
        ab3 = fd1 > fd0;
if(fo1 != null){
          fo1.m3(ab4, fb0, fb1, lb3);
}
        for(int i1=0; i1<10; i1++){
if(ao1 != null){
              lb0 = ao1.m2();
}
if(ao2 != null){
              lb2 = ao2.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
}}
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
    boolean lb0 = false;
    lb0 = ab1 || ab2;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[8][8] += fd1;
    fb1 = ad1 < ad2;
    ad3 *= -1;
    lb0 = ad4 < fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      lb1 = fo1.m2(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    lb0 = lb1 || ab1;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    fb0 = ad2 < ad3;
if(ao1 != null){
      ad4 = ao1.m3(fb1, lb0, lb1, ab1);
}
    Thought lo2 = Thought62.getInstance();
    ab2 = !ab3;
    ab4 = fd0 > fd1;
    Thought lo3 = Thought46.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
    boolean lb4 = true;
    double ld5 = 63.493971321031374;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    Output.points[0][0] += fd1;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fb0 = fb1 && fb0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought85.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fb0 = fb1 || lb1;
        fb0 = !fb1;
        lb1 = fd1 > fd0;
        double ld2 = 145.52915078939003;
        Thought lo3 = Thought54.getInstance(fb0, fb1, lb1, fb0);
        fd0 *= -1;
        fd1 *= -1;
        boolean lb4 = false;
        fb0 = ld2 < fd0;
        fd1 = ld2 + fd0;
        fb1 = fd1 > ld2;
if(fo1 != null){
          fo1.m3();
}
if(fo0 != null){
          lb1 = fo0.m2(fd0, fd1, ld2, fd0, lb4, fb0, fb1, lb1);
}
        lb4 = fb0 || fb1;
        boolean lb5 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought49.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    if (fb1) {
        fd0 *= -1;
        Thought lo1 = Thought6.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
        boolean lb2 = true;
        if (ab4) {
if(fo1 != null){
              fo1.m2(fd1, fd0, fd1, fd0);
}
            boolean lb3 = true;
            ab4 = fb0 && fb1;
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
            fd1 = fd0 + fd1;
            double ld4 = 138.18612019315512;
}}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    ad2 *= -1;
    boolean lb0 = false;
    fb0 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    lb0 = fb0 || fb1;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
}
    lb0 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb0);
}
    lb1 = ad3 > ad4;

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
    boolean lb0 = false;
    boolean lb1 = true;
    Output.points[0][1] += ad2;
    Thought lo2 = Thought49.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, ab1, ab2);
    ab3 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        double ld3 = 514.4453998846722;
        double ld4 = 377.18542997925596;
if(fo0 != null){
          lb0 = fo0.m2(lb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fo1.m2(ld3, ld4, ad1, ad2, ab4, fb0, fb1, lb0);
}
        lb1 = !ab1;
        ab2 = ad3 < ad4;
        ab3 = ab4 || fb0;
        fd0 *= -1;
        double ld5 = 268.69800640166545;
        double ld6 = 896.7058984951528;
        ad4 = fd0 + fd1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        fb1 = lb0 || lb1;
        double ld7 = 308.041430715636;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][2] -= fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 334.35362204856574;
    fb0 = fd0 < fd1;
    fb1 = ld0 > fd0;
    fd1 = ld0 + fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld0;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
    Thought lo1 = Thought21.getInstance(fb1, fb0, fb1, fb0);
if(ao1 != null){
      ao1.m3();
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    ld0 = fd0 - fd1;
    Thought lo2 = Thought77.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 - ld0;

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
    Thought lo0 = Thought58.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    Thought lo1 = Thought12.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao4.m2(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ad2 = ao4.m3(fb0, fb1, fb0, fb1);
}
    fb0 = ad3 < ad4;
    fd0 = fd1 - ad1;
    fb1 = fb0 || fb1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb2 = fb0 || fb1;
    boolean lb3 = true;
    ad2 = ad3 + ad4;

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
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    ab1 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab3 = fd0 > fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    boolean lb1 = true;
    Output.points[0][3] -= fd1;
if(ao1 != null){
      ab2 = ao1.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld2 = 471.44563561700727;
    boolean lb3 = true;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    lb0 = ld2 < fd0;

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
    ab2 = ad1 > ad2;
    Thought lo0 = Thought19.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
    double ld1 = 600.5812356454627;
    ld1 *= -1;
    boolean lb2 = false;
    if (lb2) {
        ad1 = ad2 + ad3;
        Thought lo3 = Thought31.getInstance(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
        fb0 = ad4 < fd0;
        fd1 = ld1 + ad1;
        fb1 = ad2 > ad3;
        } else if (lb2) {
if(ao3 != null){
          ad4 = ao3.m3(fd0, fd1, ld1, ad1);
}
        ab1 = ab2 && ab3;
        ad2 = ad3 + ad4;
        Thought lo4 = Thought74.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1);
        ab4 = fb0 || fb1;
        lb2 = ab1 && ab2;
        Thought lo5 = Thought53.getInstance(ab3, ab4, fb0, fb1);
if(ao3 != null){
          ao2 = ao3.m4();
}
        lb2 = ad2 < ad3;
        ad4 = fd0 - fd1;
        ld1 = ad1 + ad2;
        Thought lo6 = Thought75.getInstance(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
        ld1 = ad1 - ad2;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 506.52817811200197;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld0 = fd0 - fd1;
    ld0 *= -1;
    fd0 = fd1 + ld0;
    double ld1 = 595.6025773678944;
    fb1 = !fb0;
    ld1 = fd0 + fd1;
    ld0 = ld1 + fd0;
    boolean lb2 = false;
    Output.points[0][4] -= fd1;
    fb0 = ld0 > ld1;
    if (fb1) {
        lb2 = fb0 && fb1;
        double ld3 = 720.2155504000248;
        boolean lb4 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld3, lb4, lb2, fb0, fb1);
}
        lb4 = !lb2;
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
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab3 = ab4 && fb0;
    boolean lb0 = true;
    boolean lb1 = true;
    double ld2 = 757.1274446693074;
    ab4 = ld2 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    fd1 = ld2 + fd0;
    double ld3 = 996.4108714590533;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo4 = Thought60.getInstance(fd0, fd1, ld2, ld3, ab1, ab2, ab3, ab4);
        fb0 = fd0 > fd1;
    Thought lo5 = Thought70.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1, fb1, lb0, lb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb1;

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
    fb0 = ad1 > ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb1 = !fb0;
    ad3 = ad4 - fd0;
if(fo0 != null){
          fo0.m1(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought11.getInstance();
    Thought lo1 = Thought11.getInstance(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
    ad4 = fd0 + fd1;
    ad1 *= -1;
    Thought lo2 = Thought10.getInstance(fo1, fo0, fo1, fo0);
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    boolean lb3 = false;
        ad2 *= -1;
    Thought lo4 = Thought34.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb3, fb0);
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;

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
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = ad1 > ad2;
    double ld0 = 200.41008216952932;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ld0 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[0][5] += ad2;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 455.9017079222407;
    fd0 = fd1 - ld0;
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought26.getInstance(ld0, fd0, fd1, ld0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    Output.points[0][6] += fd1;
    fb0 = fb1 || fb0;
if(ao1 != null){
      ld0 = ao1.m3(fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    fb0 = fb1 && lb2;
    fb0 = fd0 < fd1;
    boolean lb3 = false;
    double ld4 = 971.3230004169901;
    fb0 = fb1 && lb2;
    lb3 = ld0 > ld4;
    fd0 *= -1;
    fb0 = fd1 < ld0;
    boolean lb5 = false;
    fb0 = fb1 || lb2;
    lb3 = ld4 < fd0;
if(ao2 != null){
      lb5 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, ld4, fd0, fb0, fb1, lb2, lb3);
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
    Output.points[0][7] += ad2;
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    boolean lb1 = false;
    boolean lb2 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    Output.points[0][8] -= ad3;
    Thought lo3 = Thought81.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, lb0, lb1, lb2, fb0);
    Thought lo4 = Thought36.getInstance(fo0, fo1, ao1, ao2, fb1, lb0, lb1, lb2);
    fb0 = fb1 || lb0;
    double ld5 = 501.54096106109927;
    Output.points[1][0] += ad1;
    lb1 = lb2 || fb0;
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao3.m1(fd0, fd1, ld5, ad1);
}
    ad2 = ad3 - ad4;
    Output.points[1][1] += fd0;
    fb1 = fd1 > ld5;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        double ld0 = 548.8513287146972;
if(fo1 != null){
          ab3 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          ld0 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
        ab2 = !ab3;
        ab4 = fb0 && fb1;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
if(ao3 != null){
          ab1 = ao3.m2(fd1, ld0, fd0, fd1);
}
        }
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
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
      ab2 = ao4.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Output.points[1][2] += fd1;
    ad1 *= -1;
    Thought lo0 = Thought8.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought77.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
if(ao1 != null){
      ao1.m3(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, ab1);
}
    ab2 = fd0 > fd1;
if(ao3 != null){
      ad1 = ao3.m3();
}
    ad2 = ad3 + ad4;
if(ao4 != null){
      ab3 = ao4.m2(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    Output.points[1][3] += ad3;
    fb0 = ad4 > fd0;
    boolean lb2 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
        for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb2, ab1);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
        fd1 = ad1 - ad2;
        double ld3 = 135.62495282430842;
        ad2 = ad3 + ad4;
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
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[1][4] += fd0;
    Thought lo0 = Thought19.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fd1 > fd0;
    boolean lb1 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    lb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fd1 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    lb1 = !lb2;
    fb0 = fb1 || lb1;
    lb2 = fd1 < fd0;
    fb0 = fb1 && lb1;
    lb2 = fb0 && fb1;

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
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    double ld0 = 365.97346491715143;
    double ld1 = 142.05252261417476;
    fb1 = fb0 || fb1;
    boolean lb2 = true;
    Thought lo3 = Thought97.getInstance();
    lb2 = ld0 > ld1;
    Thought lo4 = Thought24.getInstance(fd0, fd1, ld0, ld1, fb0, fb1, lb2, fb0);

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
    Thought lo0 = Thought65.getInstance(fo0, fo1, fo0, fo1);
    fd0 *= -1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
    Thought lo1 = Thought41.getInstance(fd1, fd0, fd1, fd0);

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
