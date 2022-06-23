package genetic;
import java.util.ArrayList;
class Thought87 extends Thought{
private static ArrayList<Thought87> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 379.6618187475431;
private double fd1 = 48.65991567601049;
private Thought fo0 = null;
private Thought fo1 = null;
Thought87 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought87 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought87 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought87 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought87 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought87 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought87 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought87 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought87 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought87 instance = new Thought87 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought87 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought87 instance = new Thought87 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought87 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought87 instance = new Thought87 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought87 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought87 instance = new Thought87 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought87 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought87 instance = new Thought87 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought87 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought87 instance = new Thought87 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought87 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought87 instance = new Thought87 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought87 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought87 instance = new Thought87 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    if (lb0) {
if(fo0 != null){
          fd1 = fo0.m3();
}
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        fd0 = fd1 + fd0;
        lb0 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
        Output.points[1][2] += fd1;
        fb0 = fd0 < fd1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
        fd0 = fd1 + fd0;
        lb0 = fb0 || fb1;
        lb0 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        Thought lo1 = Thought60.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
    double ld0 = 958.8676605652091;
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
    ab4 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1, fb1, lb1, ab1, ab2);
}
    ld0 = fd0 + fd1;
    Thought lo2 = Thought17.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
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
    fb0 = ad1 > ad2;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
    lb0 = !fb0;
if(fo1 != null){
      fo1.m1(fb1, lb0, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        ad1 *= -1;
        lb0 = ad2 < ad3;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = ad4 < fd0;
        fb1 = lb0 || fb0;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(fo0 != null){
      ab4 = fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought23.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = ad4 < fd0;
    boolean lb1 = false;
    Thought lo2 = Thought86.getInstance(fd1, ad1, ad2, ad3);
    Output.points[1][3] += ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Thought lo3 = Thought2.getInstance(fb0, fb1, lb1, ab1);
    ad4 = fd0 - fd1;
    ab2 = ab3 && ab4;
    double ld4 = 730.383842245132;
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ld4, ad1, ad2, ad3, fb0, fb1, lb1, ab1);
}
    boolean lb5 = true;
    double ld6 = 843.9950712844336;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb7 = true;
    double ld8 = 536.6875080164115;
    double ld9 = 18.7308729580176;
    Output.points[1][4] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb7, ab1, ab2, ab3);
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
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(ao3 != null){
      fb1 = ao3.m2(fb0, fb1, fb0, fb1);
}
    double ld0 = 670.0691085351625;
    Output.points[1][5] -= fd0;
if(ao4 != null){
      fb0 = ao4.m2();
}
    Output.points[1][6] -= fd1;
    ld0 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought42.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb1);
}
        Thought lo3 = Thought69.getInstance(ld0, fd0, fd1, ld0);
    boolean lb4 = true;
    Output.points[1][7] += fd0;
    Thought lo5 = Thought15.getInstance(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
if(ao3 != null){
      ao2 = ao3.m4(lb4, fb0, fb1, lb1);
}
    lb4 = ld0 < fd0;
    fd1 = ld0 + fd0;
if(ao4 != null){
      ao4.m2();
}
    fb0 = fb1 && lb1;
    fd1 = ld0 - fd0;

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
    ad1 *= -1;
    double ld0 = 217.60189953240027;
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb1 = true;
    ad1 = ad2 - ad3;
    fb0 = fb1 || lb1;
    fb0 = ad4 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ld0, ad1);
}
        double ld2 = 492.2794900467881;
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
    Thought lo0 = Thought71.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    ab1 = ab2 && ab3;
    Output.points[1][8] += fd0;
    Thought lo1 = Thought91.getInstance(ab4, fb0, fb1, ab1);
    Output.points[2][0] -= fd1;
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
    Thought lo2 = Thought6.getInstance();
    fd0 = fd1 - fd0;
    Thought lo3 = Thought64.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
    ab1 = fd1 > fd0;
    boolean lb4 = true;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought35.getInstance(ad2, ad3, ad4, fd0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      ad4 = ao1.m3(fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = lb1 || ab1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    boolean lb2 = false;
    if (lb1) {
        Output.points[2][1] -= ad4;
        fd0 = fd1 + ad1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, lb2, ab1, ab2, ab3);
}
        } else if (ab4) {
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb1, lb2);
}
if(ao4 != null){
          ao3 = ao4.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
        ad2 = ad3 + ad4;
if(ao4 != null){
          fd0 = ao4.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fd1 = fo0.m3();
}
if(ao1 != null){
          fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
}
        fd0 *= -1;
        ab1 = !ab2;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fd1 = ad1 - ad2;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 > fd0;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    lb0 = fd0 < fd1;
    fb0 = fb1 && lb0;
    double ld1 = 399.0338158160241;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, fb0);
}
    Thought lo2 = Thought70.getInstance();
if(fo1 != null){
      fo1.m3(fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    ld1 = fd0 - fd1;
    ld1 = fd0 + fd1;
    ld1 = fd0 - fd1;
    if (fb1) {
        ld1 *= -1;
        lb0 = !fb0;
        fd0 *= -1;
        Thought lo3 = Thought58.getInstance(fo0, fo1, fo0, fo1);
        fb1 = lb0 || fb0;
        fb1 = fd1 > ld1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    ab1 = fd0 > fd1;
    ab2 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
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
    fb1 = fb0 && fb1;
    if (fb0) {
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo1.m2(ad2, ad3, ad4, fd0);
}
        fb1 = fb0 && fb1;
        double ld0 = 654.258335957988;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
        Output.points[2][2] -= ad3;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
        boolean lb1 = true;
        lb1 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        } else {
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
    ad1 = ad2 + ad3;
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    ab4 = ad4 < fd0;
        boolean lb0 = true;
    Output.points[2][3] += fd1;
if(fo1 != null){
          ab4 = fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 && fb0;
    double ld1 = 782.9397984616538;
    double ld2 = 281.3814675475285;
    boolean lb3 = true;
    boolean lb4 = true;
    boolean lb5 = false;
    Output.points[2][4] -= ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, lb3, lb4, lb5, ab1);
}
    ab2 = ld2 > ad1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought97.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    fb0 = fb1 && fb0;
    Thought lo1 = Thought8.getInstance(fb1, fb0, fb1, fb0);
    Thought lo2 = Thought79.getInstance();
    fd1 = fd0 - fd1;
    Thought lo3 = Thought87.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
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
    fb1 = ad1 > ad2;
    Output.points[2][5] -= ad3;
    boolean lb0 = true;
if(ao2 != null){
      ao2.m1();
}
    lb0 = fb0 && fb1;
    boolean lb1 = true;
    lb0 = lb1 && fb0;
if(ao3 != null){
      ao3.m2(ad4, fd0, fd1, ad1, fb1, lb0, lb1, fb0);
}
    fb1 = ad2 < ad3;
    lb0 = ad4 < fd0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    Output.points[2][6] += fd1;
    lb1 = !fb0;
    fb1 = ad1 > ad2;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
    lb0 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    double ld2 = 994.6171425784527;
    lb1 = fd0 > fd1;
    Output.points[2][7] += ld2;
if(ao3 != null){
      ao3.m3(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    double ld3 = 725.435645413711;
    Thought lo4 = Thought43.getInstance(ld2, ld3, ad1, ad2, fb0, fb1, lb0, lb1);

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
    fd0 *= -1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    ab2 = fd1 > fd0;
    double ld0 = 393.0192588023744;
    fd0 = fd1 - ld0;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, lb2);
}
    boolean lb3 = false;
    Thought lo4 = Thought45.getInstance(fd1, ld0, fd0, fd1);
if(ao1 != null){
      lb3 = ao1.m2(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
    Output.points[2][8] += fd0;
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;
    lb2 = fd1 > ld0;
    double ld5 = 189.2477361562248;
if(ao1 != null){
      ao1.m1();
}
    boolean lb6 = true;
    lb3 = lb6 || ab1;
    Thought lo7 = Thought26.getInstance(ld5, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
    fb1 = ld5 < fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, ld5, fd0, lb1, lb2, lb3, lb6);
}
    Thought lo8 = Thought7.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);

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
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    ab2 = fd1 > ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    if (ab3) {
if(ao3 != null){
          fd1 = ao3.m3(ab4, fb0, fb1, ab1);
}
        ab2 = !ab3;
if(fo0 != null){
          ao4 = fo0.m4();
}
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
        ab2 = ab3 || ab4;
        boolean lb0 = true;
        boolean lb1 = false;
        boolean lb2 = false;
        Thought lo3 = Thought47.getInstance(ao1, ao2, ao3, ao4);
        Thought lo4 = Thought6.getInstance(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
        } else {
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    boolean lb0 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(lb1, fb0, fb1, lb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    lb1 = lb2 || fb0;
    fb1 = !lb0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
    boolean lb3 = true;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, lb1, lb2, lb3);
}
    boolean lb4 = true;
    boolean lb5 = false;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;

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
    ab1 = fd0 > fd1;
    boolean lb0 = true;
    boolean lb1 = true;
        Output.points[3][0] -= fd0;
    fd1 = fd0 + fd1;
    if (lb1) {
        fd0 = fd1 + fd0;
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
if(fo0 != null){
          fo0.m3();
}
        fb0 = fd1 > ad1;
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
        Output.points[3][1] += fd1;
        boolean lb2 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ad1 *= -1;
        double ld3 = 315.2578593083181;
        ad1 = ad2 + ad3;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld3, lb2, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        lb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
        lb1 = !lb2;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
        boolean lb4 = false;
        Output.points[3][2] += ld3;
        Thought lo5 = Thought80.getInstance();
        lb2 = lb4 && fb0;
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb1, lb0, lb1, lb2);
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ab4 = fb0 && fb1;
    Thought lo0 = Thought72.getInstance(ab1, ab2, ab3, ab4);
    double ld1 = 211.6701153313108;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad2 *= -1;
            Output.points[3][3] -= ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1, fb0, fb1, ab1, ab2);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought23.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
        ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
if(ao1 != null){
      ao1.m2(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fb0 = ao4.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    Output.points[3][4] += fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
    fd0 = fd1 - fd0;
        boolean lb1 = true;
    fb0 = fb1 && lb0;
    double ld2 = 733.7959597379803;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
    boolean lb0 = false;
    Thought lo1 = Thought95.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
    boolean lb2 = true;
    double ld3 = 73.14388205544543;
if(ao2 != null){
      ao1 = ao2.m4(lb2, fb0, fb1, lb0);
}
    boolean lb4 = false;
    lb2 = lb4 || fb0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ld3 *= -1;
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, ad1, fb1, lb0, lb2, lb4);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, lb0, lb2, lb4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fb1, lb0, lb2, lb4);
}
    double ld5 = 721.6173666698776;
if(ao4 != null){
      fb0 = ao4.m2(fd0, fd1, ld3, ld5);
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
    fd1 = fd0 + fd1;
    boolean lb0 = true;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    if (lb0) {
if(fo1 != null){
          ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
        fd0 = fd1 + fd0;
        fb1 = lb0 || ab1;
        ab2 = ab3 || ab4;
        fb0 = fd1 > fd0;
        boolean lb1 = false;
        boolean lb2 = true;
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
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ad1 = ao3.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2);
}
    fd1 *= -1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    fb1 = ad3 > ad4;
    double ld0 = 774.1392750882524;
    ab1 = ad4 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    fb0 = !fb1;
if(ao3 != null){
      ao3.m2();
}
    Thought lo2 = Thought63.getInstance(ld0, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
    lb1 = ad4 > fd0;
    fd1 *= -1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    Thought lo0 = Thought39.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fd0 *= -1;
    double ld1 = 545.2904144559923;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    double ld2 = 800.5396064943053;
    Output.points[3][5] -= ld1;
    Thought lo3 = Thought99.getInstance(fb0, fb1, fb0, fb1);
    ld2 *= -1;
if(fo1 != null){
      fo1.m2();
}
    Thought lo4 = Thought36.getInstance(fd0, fd1, ld1, ld2, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    Output.points[3][6] += fd0;
    Thought lo5 = Thought57.getInstance(fo0, fo1, fo0, fo1);
    fd1 = ld1 - ld2;
        fd0 = fd1 + ld1;
    fb0 = ld2 < fd0;
    boolean lb6 = true;
    fb0 = !fb1;
    boolean lb7 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ld2, fd0, lb6, lb7, fb0, fb1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    Output.points[3][7] += fd1;
    ab2 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    ab3 = !ab4;
    Thought lo0 = Thought35.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
        ab3 = ab4 || fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;

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
      fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld0 = 256.2478399615723;
    if (fb1) {
        Output.points[3][8] += ld0;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        Output.points[4][0] += fd1;
        Thought lo1 = Thought34.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
          ld0 = fo0.m3(ad1, ad2, ad3, ad4);
}
        boolean lb2 = false;
        lb2 = fd0 > fd1;
        ld0 = ad1 - ad2;
        double ld3 = 343.88406290610817;
        Output.points[4][1] -= ad2;
        double ld4 = 876.2341861627101;
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
    ab2 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    boolean lb1 = true;
    ab3 = !ab4;
    double ld2 = 679.44914137694;
    fb0 = ld2 < ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb0, lb1, ab1);
}
    ab2 = ld2 < ad1;
    if (ab3) {
        ab4 = ad2 < ad3;
        fb0 = !fb1;
        ad4 = fd0 + fd1;
        ld2 = ad1 + ad2;
        lb0 = ad3 > ad4;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
        if (ab4) {
            fb0 = fd0 > fd1;
if(fo0 != null){
              ld2 = fo0.m3(ad1, ad2, ad3, ad4);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb1 = fd1 > fd0;
    Thought lo0 = Thought18.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
    double ld1 = 631.5152708170574;
    Thought lo2 = Thought99.getInstance();
    boolean lb3 = false;
if(fo1 != null){
      fo1.m2(ld1, fd0, fd1, ld1, lb3, fb0, fb1, lb3);
}
    fb0 = fb1 && lb3;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1, fb1, lb3, fb0, fb1);
}
    lb3 = ld1 > fd0;
    fd1 = ld1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb3, fb0);
}
    fb1 = lb3 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1);
}
    ld1 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fb1, lb3, fb0, fb1);
}
    Thought lo4 = Thought1.getInstance();

Thought.STACK_COUNTER++;
return ao1;
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
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought8.getInstance(ao4, fo0, fo1, ao1);
    boolean lb1 = false;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, lb1, lb2, fb0, fb1);
}
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, lb1, lb2, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    Output.points[4][2] -= ad3;
    lb1 = !lb2;
    ad4 = fd0 + fd1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb1, lb2, fb0);
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
    fd0 *= -1;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Thought lo1 = Thought26.getInstance(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
    lb0 = ab1 && ab2;
    if (ab3) {
        ab4 = fd0 < fd1;
        fb0 = fd0 < fd1;
        fb1 = fd0 > fd1;
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
    ad1 *= -1;
    ad2 = ad3 + ad4;
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought80.getInstance(ab4, fb0, fb1, ab1);
    fd0 = fd1 - ad1;
    Output.points[4][3] += ad2;
    ab2 = !ab3;
    ab4 = ad3 < ad4;
    fb0 = fb1 && ab1;
    double ld1 = 25.727813528246816;
if(ao2 != null){
      ad4 = ao2.m3();
}
    ab2 = fd0 > fd1;

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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought55.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    fb0 = !fb1;
    lb1 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    Output.points[4][4] += fd0;
    boolean lb2 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb3 = false;

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
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd0 > fd1;
    fb1 = lb0 && fb0;
    Thought lo1 = Thought12.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    Thought lo2 = Thought62.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    boolean lb3 = true;
    double ld4 = 810.4269025271333;
    lb0 = ld4 > fd0;
    fd1 = ld4 - fd0;
    boolean lb5 = true;

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
    double ld0 = 929.6320681671122;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
    fd0 *= -1;
    Output.points[4][5] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    double ld1 = 158.9379545470804;
        ld1 *= -1;
if(fo1 != null){
              fo1.m2(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
    ld1 = fd0 - fd1;
    ld0 *= -1;
    Output.points[4][6] -= ld1;
    fd0 = fd1 - ld0;
    fb1 = ld1 < fd0;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[4][7] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld1, fd0, fd1, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, fb0, fb1, lb2, fb0);
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
