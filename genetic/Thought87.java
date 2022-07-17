package genetic;
import java.util.ArrayList;
class Thought87 extends Thought{
private static ArrayList<Thought87> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 971.171035422908;
private double fd1 = 337.7870132058231;
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
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    Thought lo1 = Thought320.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    Thought lo2 = Thought4.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = fd1 > fd0;
        Thought lo3 = Thought384.getInstance(lb0, fb0, fb1, lb0);
        fb0 = fb1 && lb0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        double ld4 = 364.9174110177454;
if(fo1 != null){
          fo1.m1(ld4, fd0, fd1, ld4);
}
        fd0 = fd1 + ld4;
        boolean lb5 = true;
        boolean lb6 = false;
        boolean lb7 = false;
        double ld8 = 142.1849882577171;
if(fo0 != null){
          ld8 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld4, ld8);
}
        boolean lb9 = true;
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
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    boolean lb2 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
    boolean lb3 = true;
        Thought lo4 = Thought149.getInstance();
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, lb2, lb3);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[0][5] += fd1;
    Thought lo5 = Thought339.getInstance(fd0, fd1, fd0, fd1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought52.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    Thought lo1 = Thought65.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb2 = false;

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
      ab2 = fo0.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd1 = ad1 + ad2;
    double ld0 = 106.13249994639263;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + ld0;
    Output.points[0][6] += ad1;
    fb0 = ad2 < ad3;
    fb1 = !ab1;
    ab2 = ad4 < fd0;
    Output.points[0][7] += fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
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
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
    Output.points[0][8] -= fd1;
    double ld0 = 121.15276454385267;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(ld0, fd0, fd1, ld0);
}
    Thought lo1 = Thought54.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
    boolean lb2 = true;
    Thought lo3 = Thought364.getInstance(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb2);
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb2);
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb2, fb0);
}
        for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
        Thought lo4 = Thought267.getInstance(ld0, fd0, fd1, ld0);
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
        Thought lo5 = Thought139.getInstance(fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb2);
        ld0 = fd0 + fd1;
        fb0 = ld0 < fd0;
        double ld6 = 468.4153330346265;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb2, fb0, fb1);
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
    Output.points[1][0] += ad1;
    fb0 = fb1 && fb0;
    if (fb1) {
if(ao2 != null){
          ad2 = ao2.m3();
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        ad1 = ad2 - ad3;
        fb0 = fb1 || fb0;
        boolean lb0 = true;
        boolean lb1 = false;
        ad4 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(lb1, fb0, fb1, lb0);
}
        lb1 = fd0 < fd1;
        Thought lo2 = Thought328.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
          fb0 = ao3.m2(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
if(ao4 != null){
          ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
}
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb0, lb1, fb0);
}
            boolean lb3 = false;
            ad1 = ad2 + ad3;
if(fo0 != null){
              fo0.m1();
}
            Output.points[1][1] -= ad4;
            boolean lb4 = true;
            lb1 = fb0 && fb1;
            lb3 = !lb4;
            Output.points[1][2] -= fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought244.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fd1 *= -1;
    fd0 *= -1;
        fb0 = fb1 || ab1;
    ab2 = fd1 < fd0;
    ab3 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    boolean lb1 = true;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb2 = true;
    ab4 = !fb0;
    fd1 = fd0 - fd1;

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
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
    ab2 = !ab3;
    ab4 = ad2 > ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
        Thought lo0 = Thought199.getInstance(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    ab1 = ab2 && ab3;
    double ld1 = 125.31058192552351;
if(ao4 != null){
      fd0 = ao4.m3();
}
    ab4 = fb0 && fb1;
    Thought lo2 = Thought20.getInstance(fo0, fo1, ao1, ao2, fd1, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, ab1, ab2);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;
    ld1 = ad1 - ad2;
    Thought lo3 = Thought104.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
    Thought lo4 = Thought194.getInstance(fo0, fo1, ao1, ao2, ld1, ad1, ad2, ad3);
if(ao3 != null){
      ab3 = ao3.m2(ad4, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
    Thought lo5 = Thought314.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
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
    boolean lb0 = true;
    boolean lb1 = true;
    lb1 = !fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought391.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb0 = lb1 && fb0;
    fb1 = lb0 && lb1;
    fb0 = !fb1;
    lb0 = !lb1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    double ld3 = 115.56362188183701;
    fd0 = fd1 + ld3;
    boolean lb4 = true;
        Thought lo5 = Thought48.getInstance(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb0);
    lb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0, lb4, fb0, fb1, lb0);
}
    Output.points[1][3] += fd1;
    double ld6 = 760.9541586437938;
    ld3 = ld6 - fd0;
    Thought lo7 = Thought60.getInstance(lb1, lb4, fb0, fb1);
    boolean lb8 = true;
    Thought lo9 = Thought123.getInstance(fo0, fo1, fo0, fo1);

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
    fd1 *= -1;
    double ld0 = 402.45008672246735;
    ab2 = !ab3;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    ab3 = ab4 || fb0;
    double ld2 = 116.86721195235596;
    ld2 *= -1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld2, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld2, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ld0 *= -1;
    boolean lb3 = false;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 456.26726589125775;
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    double ld1 = 477.3745364847381;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld1, ad1);
}
        fb1 = !fb0;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2(ld0, ld1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
    boolean lb3 = true;
if(fo0 != null){
      lb2 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ad1, lb3, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(lb3, fb0, fb1, lb2);
}
    ad2 = ad3 + ad4;
    double ld4 = 742.4157840629039;
    ad4 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ld1 = ld4 - ad1;
    boolean lb5 = true;
    lb3 = !lb5;

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
    ab1 = ad1 < ad2;
    ad3 *= -1;
if(fo0 != null){
      ab2 = fo0.m2(ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought125.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    double ld1 = 575.4155908661695;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, fb0, fb1, ab1, ab2);
}
    Output.points[1][4] += ad2;
    ab3 = ad3 > ad4;
if(fo0 != null){
      fd0 = fo0.m3(ab4, fb0, fb1, ab1);
}
    double ld2 = 33.161807691422865;
    ab2 = ab3 || ab4;
    Output.points[1][5] -= fd0;
    fb0 = fd1 > ld1;
    Thought lo3 = Thought108.getInstance(fo1, fo0, fo1, fo0);
    fb1 = ab1 || ab2;
    Thought lo4 = Thought151.getInstance(ld2, ad1, ad2, ad3);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
    ld2 = ad1 + ad2;
    ab3 = ab4 || fb0;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ld2, ad1, fb1, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
return ab4;
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
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = !fb0;
    Thought lo1 = Thought277.getInstance(fb1, lb0, fb0, fb1);
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    boolean lb2 = true;
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    lb2 = fd1 > fd0;
    lb3 = !fb0;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0, fb1, lb0, lb2, lb3);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb2);
}
if(ao1 != null){
      ao1.m3();
}
    double ld4 = 508.3985539817472;
    lb3 = fb0 && fb1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb1 = !fb0;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    ad2 = ad3 - ad4;
    Output.points[1][6] += fd0;
if(ao2 != null){
      fb1 = ao2.m2(lb0, fb0, fb1, lb0);
}
    Output.points[1][7] += fd1;
    fb0 = ad1 < ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb1 = ad3 > ad4;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ad1, ad2, ad3);
}
    boolean lb1 = true;
    lb0 = lb1 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
    boolean lb2 = true;
    if (fb0) {
        fb1 = lb0 || lb1;
if(ao4 != null){
          ad2 = ao4.m3(ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb0);
}
        lb1 = ad1 > ad2;
if(fo0 != null){
          ad3 = fo0.m3(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb0);
}
if(ao4 != null){
          ao4.m1();
}
        double ld3 = 614.0872192109579;
        double ld4 = 281.91156018654607;
if(fo0 != null){
          lb1 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb0);
}
        double ld5 = 239.12127136586585;
        lb1 = fd0 < fd1;
        Thought lo6 = Thought126.getInstance(lb2, fb0, fb1, lb0);
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
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought24.getInstance(ao2, ao3, ao4, fo0);
    boolean lb2 = false;
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    lb0 = !lb2;
    Output.points[1][8] += fd1;
if(ao2 != null){
          lb3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[2][0] += fd1;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, lb2, lb3, ab1);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
        fd0 = fd1 + fd0;
        boolean lb4 = true;
        ab1 = fd1 < fd0;
        for(int i1=0; i1<10; i1++){
            double ld5 = 778.1209420593956;
            fd0 = fd1 + ld5;
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
    ab1 = ad2 > ad3;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(fb1, ab1, ab2, ab3);
}
    fd1 = ad1 - ad2;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought326.getInstance(ad3, ad4, fd0, fd1);
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought186.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);

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
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
        fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought162.getInstance(fb0, fb1, fb0, fb1);
    if (fb0) {
        fb1 = !fb0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        fb1 = !fb0;
        fb1 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        Thought lo1 = Thought198.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
          fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        boolean lb2 = false;
        fb0 = fb1 || lb2;
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
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought236.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
    fd1 = fd0 - fd1;
    Thought lo1 = Thought205.getInstance(ab4, fb0, fb1, ab1);
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb2 = true;
    boolean lb3 = true;
    Output.points[2][1] += fd0;
    lb3 = fd1 < fd0;
    Thought lo4 = Thought154.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    Thought lo5 = Thought84.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb3);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3();
}
    for(int i0=0; i0<10; i0++){
        Thought lo6 = Thought322.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
        fd0 *= -1;
if(fo0 != null){
          fd1 = fo0.m3(fb0, fb1, lb2, lb3);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][2] += ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    lb0 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    Output.points[2][3] += ad2;
    ad3 = ad4 + fd0;
    if (fb1) {
        Thought lo1 = Thought32.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
        ad4 = fd0 - fd1;
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
    ab1 = !ab2;
        ad2 = ad3 - ad4;
    boolean lb0 = true;
    ab2 = ab3 || ab4;
    Thought lo1 = Thought328.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
    fb0 = ad3 < ad4;
    Output.points[2][4] -= fd0;
    double ld3 = 971.5678104805196;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    lb2 = ab1 || ab2;

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
    Thought lo0 = Thought39.getInstance(ao1, ao2, ao3, ao4);
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    fb0 = !fb1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    double ld2 = 51.614294726011636;
    lb1 = ld2 < fd0;
    Thought lo3 = Thought342.getInstance(fd1, ld2, fd0, fd1, fb0, fb1, lb1, fb0);
    fb1 = lb1 && fb0;
    Thought lo4 = Thought121.getInstance(fo1, ao1, ao2, ao3, fb1, lb1, fb0, fb1);
    ld2 *= -1;
if(ao4 != null){
      lb1 = ao4.m2();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought397.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought216.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 > ad3;
        fb0 = !fb1;
    fb0 = ad4 < fd0;
    fb1 = fb0 || fb1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    Thought lo1 = Thought93.getInstance();
    double ld2 = 884.5268184634075;
    ld2 = fd0 - fd1;
    boolean lb3 = false;
if(fo1 != null){
      ld2 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb4 = false;
if(fo0 != null){
      fo0.m1(lb0, lb3, lb4, ab1);
}
    ab2 = fd1 < ld2;
    boolean lb5 = true;
    ab2 = !ab3;
    Thought lo6 = Thought45.getInstance(fo1, ao1, ao2, ao3);
    Thought lo7 = Thought344.getInstance(fd0, fd1, ld2, fd0);
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1);
}
if(ao3 != null){
      ld2 = ao3.m3(fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb3);
}
    fd1 = ld2 - fd0;
    Thought lo8 = Thought91.getInstance(ao4, fo0, fo1, ao1, lb4, lb5, ab1, ab2);
    double ld9 = 587.8977221116282;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab3 = fd1 < ld2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld9, fd0, fd1, ld2, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(lb3, lb4, lb5, ab1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    Thought lo10 = Thought359.getInstance(ld9, fd0, fd1, ld2);
    ab2 = !ab3;

Thought.STACK_COUNTER++;
return ld9;
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
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought256.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
          ad1 = ao2.m3(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
            ad2 = ad3 - ad4;
    Thought lo1 = Thought102.getInstance(ao3, ao4, fo0, fo1);
    ab2 = fd0 < fd1;
        ad1 = ad2 - ad3;
        double ld2 = 852.389275441171;
if(ao1 != null){
          ab3 = ao1.m2(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, ad1, ad2, ad3);
}
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ld2, ad1, ab4, fb0, fb1, ab1);
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
    Thought lo0 = Thought267.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
        fb1 = !fb0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
if(fo1 != null){
      lb1 = fo1.m2(fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
    fd1 = fd0 - fd1;
    fb1 = lb1 && fb0;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb1 = fb0 && fb1;
    fd0 = fd1 - fd0;

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
    ab1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    double ld0 = 876.8214985137215;
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
    ab2 = !ab3;
    double ld1 = 596.6712182992352;
    Thought lo2 = Thought217.getInstance(ab4, fb0, fb1, ab1);
    ab2 = ld1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = fd1 < ld0;
    boolean lb3 = true;

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
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    ad2 = ad3 - ad4;
    fb0 = fd0 > fd1;
    fb1 = lb0 && fb0;
    ad1 *= -1;
    fb1 = !lb0;
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
    lb0 = fb0 && fb1;
    lb0 = fd0 > fd1;
    fb0 = fb1 || lb0;

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
    ab2 = ab3 && ab4;
    ad1 = ad2 - ad3;
    fb0 = fb1 || ab1;
    ab2 = ad4 < fd0;
    fd1 *= -1;
    Output.points[2][5] += ad1;
    ab3 = ad2 > ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
if(fo0 != null){
      ab4 = fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = fd1 < ad1;
    ad2 = ad3 - ad4;
    ab2 = ab3 && ab4;
    Thought lo0 = Thought85.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);

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
    double ld0 = 979.3500264275517;
    ld0 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
    if (fb1) {
if(ao2 != null){
          ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
        fd1 = ld0 - fd0;
        fd1 = ld0 + fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
          ld0 = ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          fd0 = ao3.m3();
}
        Thought lo1 = Thought131.getInstance(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
        fb1 = ld0 < fd0;
        fd1 = ld0 - fd0;
        Thought lo2 = Thought230.getInstance(fb0, fb1, fb0, fb1);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fb0 = fd1 < ld0;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld0, fd0);
}
        fb1 = fd1 > ld0;
        } else {
        double ld3 = 323.32903224104496;
        if (fb0) {
}}
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
    double ld0 = 489.43738664676994;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld0;
    ad1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        Output.points[2][6] -= fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        boolean lb1 = true;
if(ao1 != null){
          ld0 = ao1.m3();
}
        ad1 = ad2 - ad3;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
        ad1 = ad2 + ad3;
        Output.points[2][7] += ad4;
if(ao2 != null){
          ao2.m1(fb1, lb1, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        Thought lo2 = Thought199.getInstance(fd0, fd1, ld0, ad1);
if(ao3 != null){
          lb1 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
        fd1 = ld0 - ad1;
        ad2 = ad3 + ad4;
        Thought lo3 = Thought268.getInstance(fd0, fd1, ld0, ad1, fb0, fb1, lb1, fb0);
        boolean lb4 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb4);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
        Thought lo5 = Thought243.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb4);
        double ld6 = 547.1843936702019;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
    if (ab2) {
        double ld0 = 674.1120124590691;
if(ao2 != null){
          ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
        ab1 = ld0 > fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          fd1 = ao3.m3(ld0, fd0, fd1, ld0);
}
        boolean lb1 = false;
        double ld2 = 569.6998639343495;
        Thought lo3 = Thought303.getInstance(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld0);
if(ao2 != null){
          ld2 = ao2.m3(fd0, fd1, ld0, ld2, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
        double ld4 = 315.4272773368631;
        double ld5 = 752.3578190437775;
        ld4 *= -1;
        } else if (ab1) {
        boolean lb6 = false;
        ab1 = ab2 || ab3;
        fd1 = fd0 - fd1;
        boolean lb7 = true;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
        fd0 *= -1;
        lb6 = lb7 && ab1;
        fd1 = fd0 - fd1;
        ab2 = ab3 || ab4;
        Thought lo8 = Thought168.getInstance();
        fb0 = fd0 < fd1;
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
    double ld0 = 484.98098006982;
    ad1 *= -1;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ld0 + ad1;
    if (ab1) {
        ad2 = ad3 + ad4;
        Thought lo1 = Thought345.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          fd1 = fo0.m3(ld0, ad1, ad2, ad3);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
}
        double ld2 = 201.9468492332715;
        boolean lb3 = false;
if(fo1 != null){
          ld0 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb3, ab1);
}
        boolean lb4 = true;
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
    boolean lb0 = false;
    lb0 = !fb0;
    fd0 *= -1;
    Output.points[2][8] -= fd1;
    Output.points[3][0] += fd0;
    fb1 = fd1 < fd0;
    boolean lb1 = false;
    double ld2 = 872.4401389253895;
    lb0 = fd0 > fd1;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    ld2 = fd0 - fd1;

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
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[3][1] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 < fd1;
    boolean lb0 = true;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought384.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    boolean lb2 = false;
    Thought lo3 = Thought383.getInstance(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
    fd1 *= -1;
    double ld4 = 429.6866476191444;
    lb2 = !fb0;
    double ld5 = 158.02752466089368;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld4, ld5, fd0, fd1, lb0, lb2, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb2, fb0, fb1);
}
    boolean lb6 = true;

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
    fd0 = fd1 - fd0;
    Thought lo0 = Thought19.getInstance(fo1, fo0, fo1, fo0);
    Thought lo1 = Thought58.getInstance(fd1, fd0, fd1, fd0);
    Thought lo2 = Thought234.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fb0 = fd1 < fd0;
    fb1 = !fb0;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    fd0 *= -1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1();
}
    boolean lb3 = true;

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
