package genetic;
import java.util.ArrayList;
class Thought24 extends Thought{
private static ArrayList<Thought24> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 503.49257298899335;
private double fd1 = 918.7478443556871;
private Thought fo0 = null;
private Thought fo1 = null;
Thought24 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought24 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought24 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought24 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought24 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought24 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought24 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought24 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought24 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[6][1] -= fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2();
}
        fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    double ld0 = 276.61648513379333;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
    double ld3 = 904.5758892414624;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ld3, fd0, fb0, fb1, lb1, lb2);
}
    fb0 = fd1 > ld0;
    fb1 = lb1 && lb2;

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
    fd1 = fd0 - fd1;
    Thought lo0 = Thought88.getInstance();
    ab1 = !ab2;
    boolean lb1 = false;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    ab4 = fd0 < fd1;
    boolean lb2 = false;
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = ab2 || ab3;
    boolean lb3 = false;
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        Output.points[6][2] += fd1;
        fd0 = fd1 - fd0;
        Thought lo4 = Thought26.getInstance(fo0, fo1, fo0, fo1, lb1, lb2, lb3, ab1);
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fd1 *= -1;
        double ld5 = 108.88844180718924;
        ld5 = fd0 + fd1;
if(fo1 != null){
          fo1.m3();
}
        ld5 = fd0 + fd1;
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
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    lb0 = fd0 < fd1;
    if (fb0) {
        fb1 = ad1 > ad2;
if(fo0 != null){
          fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        fb0 = fb1 && lb0;
        fb0 = fb1 && lb0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
        fd0 = fd1 + ad1;
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
            lb0 = !fb0;
            ad3 = ad4 + fd0;
if(fo1 != null){
              fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
            boolean lb1 = false;
            lb1 = ad4 < fd0;
            Thought lo2 = Thought18.getInstance();
            lb0 = fd1 > ad1;
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
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb0 = true;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    boolean lb1 = true;
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld2 = 157.07428413449378;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, ad1, ad2, ab3, ab4, fb0, fb1);
}
    lb0 = lb1 || ab1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    fb0 = fb1 || lb0;
    ld2 = ad1 - ad2;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb3, ab1, ab2);
}
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2);
}
    boolean lb4 = true;
    ab2 = ad1 > ad2;
    ab3 = ad3 > ad4;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1, fb0, fb1, lb0, lb1);
}
    ad2 *= -1;

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
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, lb1, fb0, fb1);
}
    lb0 = fd1 < fd0;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Output.points[6][3] -= fd0;
    Thought lo3 = Thought92.getInstance(lb0, lb1, lb2, fb0);

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
    boolean lb0 = true;
    fd0 = fd1 - ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    fb1 = ad2 > ad3;
    Output.points[6][4] += ad4;
    fd0 *= -1;
    fd1 = ad1 - ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1);
}
    lb0 = ad4 > fd0;
if(ao1 != null){
      ao1.m1(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    double ld1 = 330.48897267005293;
    fb1 = !lb0;

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
    Output.points[6][5] += fd1;
    Thought lo0 = Thought90.getInstance();
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
if(ao3 != null){
      fd0 = ao3.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fd0 = fd1 + fd0;
    Output.points[6][6] -= fd1;
    fb1 = fd0 > fd1;
    lb1 = !ab1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fb1 = ao3.m2(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    double ld2 = 217.75580585233234;
if(ao4 != null){
      fd0 = ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb1);
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
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    boolean lb0 = true;
    ab2 = ad2 < ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, lb0, ab1, ab2, ab3);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = ad1 < ad2;
    if (lb1) {
if(ao1 != null){
          ao1.m2();
}
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
        ab1 = ab2 || ab3;
        ab4 = fb0 || fb1;
        lb0 = lb1 && ab1;
        Output.points[6][7] += ad1;
        ad2 = ad3 + ad4;
        fd0 = fd1 + ad1;
if(ao4 != null){
          ad2 = ao4.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
        Thought lo2 = Thought89.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb0, lb1, ab1, ab2);
        fd0 *= -1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
          lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
        fd1 = ad1 - ad2;
        lb1 = ab1 || ab2;
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
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = !fb0;
    Output.points[6][8] += fd0;
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    Output.points[7][0] -= fd0;
    Output.points[7][1] -= fd1;
if(fo0 != null){
      fo0.m3();
}
    double ld1 = 862.7699486973825;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 473.8395478849637;
    Thought lo1 = Thought81.getInstance(ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    fd1 = ld0 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb2 = false;
    boolean lb3 = false;
    Output.points[7][2] += ld0;
    ab2 = !ab3;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb2 = lb3 || lb4;
        ab1 = fd0 > fd1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought68.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[7][3] += fd0;
    fb1 = fd1 > ad1;
    double ld1 = 282.1529084116127;
    boolean lb2 = true;
    ad1 *= -1;
    ad2 *= -1;
    Thought lo3 = Thought52.getInstance(ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb2);
}
    Output.points[7][4] += ld1;
    if (fb0) {
        fb1 = !lb2;
        } else {
        Output.points[7][5] -= ad1;
        ad2 = ad3 - ad4;
        fd0 = fd1 - ld1;
        ad1 *= -1;
        ad2 = ad3 - ad4;
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
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ad4 = fd0 - fd1;
    boolean lb0 = true;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || lb0;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
    boolean lb2 = false;
if(fo0 != null){
      ab3 = fo0.m2();
}
    boolean lb3 = false;
    ab3 = ab4 && fb0;
    Thought lo4 = Thought10.getInstance(fd0, fd1, ad1, ad2);
    fb1 = lb0 || lb1;
if(fo1 != null){
      fo1.m3(lb2, lb3, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    Thought lo5 = Thought72.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, lb1, lb2, lb3);
    ab1 = !ab2;
    ab3 = fd1 > ad1;
    ab4 = fb0 && fb1;

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
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought44.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fd0 = ao1.m3();
}
    boolean lb1 = false;

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
    boolean lb0 = false;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
    boolean lb1 = true;
    Output.points[7][6] += ad1;
    ad2 *= -1;
    lb0 = lb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, lb1, fb0);
}
    fb1 = ad3 > ad4;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, lb0, lb1, fb0, fb1);
}
    lb0 = ad2 > ad3;
    boolean lb2 = true;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    lb2 = !fb0;
    double ld3 = 606.3101328834142;
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(ao1 != null){
      ao1.m2(ld3, ad1, ad2, ad3, fb1, lb0, lb1, lb2);
}
    ad4 = fd0 + fd1;
if(ao2 != null){
      fb0 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(ld3, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, lb2);
}
    Thought lo4 = Thought68.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld3);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
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
    Thought lo0 = Thought55.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    Output.points[7][7] += fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    ab3 = ab4 || fb0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought44.getInstance(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
    boolean lb2 = false;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ab1 = ab2 && ab3;
    fd1 = fd0 + fd1;
    ab4 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb2, ab1);
}
if(ao2 != null){
      ab2 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    double ld3 = 807.8872376260078;
    fd0 = fd1 + ld3;
    boolean lb4 = true;
    lb2 = fd0 < fd1;
    lb4 = ab1 || ab2;
if(ao1 != null){
      ld3 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld3, fd0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    double ld0 = 205.05046251964635;
    fb0 = ld0 < ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = ld0 - ad1;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ad2 *= -1;
    ab4 = !fb0;
    Thought lo1 = Thought19.getInstance(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
    if (ab4) {
        fb0 = fb1 || ab1;
        ab2 = ld0 < ad1;
if(fo1 != null){
          fo1.m2();
}
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
        ab3 = !ab4;
        for(int i0=0; i0<10; i0++){
if(ao4 != null){
              ao3 = ao4.m4(fb0, fb1, ab1, ab2);
}
            ab3 = ab4 && fb0;
            fd1 *= -1;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3);
}
            fb1 = ad4 < fd0;
if(fo0 != null){
              fd1 = fo0.m3(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
            double ld2 = 450.9122189092815;
if(ao4 != null){
              ad3 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
            ab3 = !ab4;
if(ao3 != null){
              ao3.m3(ao4, fo0, fo1, ao1);
}
            boolean lb3 = false;
if(ao3 != null){
              ao2 = ao3.m4(ad4, fd0, fd1, ld2, ab4, fb0, fb1, lb3);
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
    fb0 = fb1 && fb0;
    Thought lo0 = Thought55.getInstance();
    fd1 *= -1;
    fd0 *= -1;
    fb1 = fd1 < fd0;
    Output.points[7][8] += fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    Output.points[8][0] += fd0;
    Thought lo1 = Thought28.getInstance(fb0, fb1, fb0, fb1);
    boolean lb2 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
    Thought lo4 = Thought54.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb2, lb3, fb0, fb1);
    Output.points[8][1] += fd1;
    fd0 = fd1 - fd0;
    Output.points[8][2] -= fd1;
    lb2 = lb3 || fb0;
    double ld5 = 603.4226293020054;
    fb1 = ld5 > fd0;
    boolean lb6 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb3, lb6, fb0);
}
    fb1 = !lb2;

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
    Thought lo0 = Thought8.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
        fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb1;
    fd0 *= -1;
    Thought lo2 = Thought53.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Thought lo3 = Thought84.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      lb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
        ad1 = ad2 + ad3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
        fb0 = ad2 > ad3;
        ad4 = fd0 + fd1;
        if (fb1) {
if(fo0 != null){
              fo0.m3();
}
            } else if (lb0) {
            ad1 = ad2 - ad3;
            Output.points[8][3] -= ad4;
            boolean lb1 = false;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ad1;
    fb1 = lb0 && ab1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        ab1 = ab2 || ab3;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    Output.points[8][4] += fd1;
if(fo1 != null){
      fo1.m2();
}
    ad1 = ad2 + ad3;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
}
    double ld1 = 789.8865964154139;
    ld1 = fd0 + fd1;
    ld1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - ld1;
    fb1 = fd0 > fd1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1);
}
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + ld1;

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
    boolean lb0 = false;
    lb0 = ad1 > ad2;
    boolean lb1 = true;
    lb1 = ad3 > ad4;
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, fb1, lb0, lb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld2 = 921.3556544296257;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld2, ad1);
}
    ad2 = ad3 + ad4;
    Thought lo3 = Thought73.getInstance(fb1, lb0, lb1, fb0);
        fb1 = lb0 || lb1;
    fb0 = fb1 && lb0;
    lb1 = fd0 > fd1;
    boolean lb4 = true;

Thought.STACK_COUNTER++;
return ld2;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 + fd1;
    ab4 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought71.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
    boolean lb1 = true;
        fd1 *= -1;
    if (ab3) {
        Thought lo2 = Thought60.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
        ab1 = fd0 > fd1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    ab2 = ab3 || ab4;
        fb0 = fb1 || ab1;
    Thought lo0 = Thought73.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    fb1 = ab1 || ab2;
    fd1 = ad1 - ad2;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3();
}
    ab2 = ad3 < ad4;
    ab3 = !ab4;
    fb0 = !fb1;
    double ld2 = 577.6145502976298;
    ad4 = fd0 - fd1;
    ld2 = ad1 - ad2;
    lb1 = ad3 > ad4;
    double ld3 = 71.37116502572576;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld2);
}
    ab1 = !ab2;
    ld3 *= -1;
if(ao3 != null){
      ad1 = ao3.m3(ab3, ab4, fb0, fb1);
}
    boolean lb4 = false;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ld2;

Thought.STACK_COUNTER++;
return ld3;
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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought74.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
        fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought2.getInstance();
    fb1 = !fb0;
    Output.points[8][5] -= fd1;
    boolean lb2 = true;
    Thought lo3 = Thought89.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
    Output.points[8][6] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb2, fb0, fb1);
}
        fd1 = fd0 - fd1;
        lb2 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
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
    ab1 = ab2 && ab3;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb0 = lb1 || lb2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, lb2, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld3 = 374.384733106703;
    Output.points[8][7] -= fd0;

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
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
    double ld0 = 708.1056637669628;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    double ld1 = 519.7912619675576;
    boolean lb2 = false;
    fb0 = ld0 < ld1;
    boolean lb3 = false;
    fb0 = fb1 || lb2;
    lb3 = fb0 || fb1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2, lb2, lb3, fb0, fb1);
}
    double ld4 = 533.1858276391987;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
}
    lb2 = !lb3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[8][8] -= ad2;
    fb0 = ad3 < ad4;
    Output.points[0][0] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld0, ld1, ld4, ad1, fb1, lb2, lb3, fb0);
}
    fb1 = lb2 || lb3;
    ad2 = ad3 - ad4;

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
    ab1 = ad2 > ad3;
    ad4 = fd0 + fd1;
        ab2 = ab3 || ab4;
    double ld0 = 276.48920779669277;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = ld0 > ad1;
    ab1 = ab2 && ab3;
    ab4 = ad2 > ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      ld0 = fo0.m3(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fb0 = fd1 < ld0;
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    ab1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
    lb1 = !ab1;
    Thought lo2 = Thought15.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = ld0 > ad1;

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
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
    Output.points[0][1] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 *= -1;
    Thought lo0 = Thought60.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    if (fb1) {
        Thought lo1 = Thought55.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
        Thought lo2 = Thought60.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
}
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
    fb0 = ad1 > ad2;
        boolean lb0 = true;
    fb0 = fb1 && lb0;
    boolean lb1 = false;
    lb1 = ad3 < ad4;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, ad1, ad2, lb0, lb1, fb0, fb1);
}
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ad1);
}
    Output.points[0][2] += ad2;
    ad3 *= -1;
    lb0 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, fb0, fb1);
}
    fd1 = ad1 - ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    boolean lb3 = true;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    ab1 = fd0 < fd1;
    boolean lb0 = false;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought51.getInstance(fo1, ao1, ao2, ao3);
    boolean lb3 = false;
    fd0 = fd1 + fd0;
    Thought lo4 = Thought31.getInstance(fd1, fd0, fd1, fd0, lb3, ab1, ab2, ab3);
if(fo0 != null){
      ao4 = fo0.m4();
}
    Thought lo5 = Thought17.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    lb1 = fd1 < fd0;
    fd1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb3, ab1, ab2, ab3);
}
    fd1 *= -1;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought82.getInstance(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
    boolean lb2 = false;
    ab3 = fd0 > fd1;
    ab4 = ad1 > ad2;
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao2 != null){
      fb1 = ao2.m2(ad3, ad4, fd0, fd1);
}
    lb0 = lb2 && ab1;
    ab2 = ad1 > ad2;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
    lb0 = ad2 < ad3;
        lb2 = ad4 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    Output.points[0][3] -= ad4;
    fd0 = fd1 - ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb2);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    ab1 = ab2 && ab3;
    boolean lb3 = false;
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao3.m1(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    lb0 = ad3 < ad4;
    lb2 = lb3 && ab1;
    Output.points[0][4] -= fd0;

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
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 435.0136233837715;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ld0 > fd0;
    fb1 = fb0 && fb1;
    fd1 = ld0 + fd0;
    boolean lb1 = true;
    lb1 = fd1 > ld0;
    fd0 *= -1;
    boolean lb2 = true;
    fd1 = ld0 - fd0;
    boolean lb3 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
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
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    double ld0 = 513.1337467283452;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
    fd0 *= -1;
    fb0 = fd1 < ld0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    boolean lb1 = true;
    fb0 = !fb1;
    Output.points[0][5] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought17.getInstance(fo0, fo1, fo0, fo1);

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
    Thought lo0 = Thought8.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought43.getInstance();
    Thought lo2 = Thought40.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
    double ld3 = 35.61553731871402;
    double ld4 = 304.6495415695672;
    ld3 *= -1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld3, fb1, fb0, fb1, fb0);
}
    ld4 = fd0 + fd1;
    ld3 = ld4 + fd0;
    fb1 = fd1 > ld3;

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
