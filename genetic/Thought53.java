package genetic;
import java.util.ArrayList;
class Thought53 extends Thought{
private static ArrayList<Thought53> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 52.380394375641956;
private double fd1 = 521.9937566860142;
private Thought fo0 = null;
private Thought fo1 = null;
Thought53 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought53 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought53 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought53 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought53 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought53 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought53 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought53 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought53 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = !fb1;
    boolean lb0 = true;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld2 = 808.5747294526425;
        lb0 = ld2 > fd0;
    lb1 = fb0 || fb1;
    boolean lb3 = false;
    fd1 = ld2 - fd0;
    lb0 = lb1 && lb3;
if(fo1 != null){
      fd1 = fo1.m3(ld2, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
    lb3 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + ld2;
    boolean lb4 = true;
    boolean lb5 = false;
    fd0 = fd1 - ld2;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld2, fd0, fd1);
}
    lb0 = ld2 > fd0;
    double ld6 = 467.03788836046937;
        lb1 = lb3 || lb4;
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(lb5, fb0, fb1, lb0);
}
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ld6, fd0, fd1, ld2);
}
    boolean lb7 = true;

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
    ab2 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    if (ab1) {
        Output.points[4][4] += fd0;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
        ab1 = ab2 || ab3;
        double ld0 = 175.72276867470887;
if(fo1 != null){
          ab4 = fo1.m2(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
    boolean lb0 = false;
    lb0 = ad1 < ad2;
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1);
}
    fb1 = lb0 && fb0;
    fb1 = !lb0;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    ad4 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
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
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
    ab2 = ad1 < ad2;
    ab3 = !ab4;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m1(fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fb1 && ab1;
            ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
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
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    double ld0 = 1000.7368567667378;
    Thought lo1 = Thought94.getInstance(fo0, fo1, ao1, ao2);
    Thought lo2 = Thought27.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 < ld0;
    fd0 *= -1;
    fb1 = fd1 > ld0;
    double ld3 = 581.1094372855308;
if(ao4 != null){
      ao3 = ao4.m4();
}
    Output.points[4][5] -= ld3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld3);
}
    fd0 = fd1 - ld0;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    Thought lo4 = Thought18.getInstance(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    double ld5 = 525.4152790886075;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
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
    double ld0 = 558.6303857073345;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    ad4 = fd0 - fd1;
    fb1 = fb0 && fb1;
if(ao1 != null){
      fb0 = ao1.m2(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2();
}
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao3.m3(ld0, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
    fd1 = ld0 - ad1;
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
    fb1 = fb0 && fb1;
    fd0 *= -1;
    Output.points[4][6] -= fd1;

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
    ab1 = fd0 > fd1;
    if (ab2) {
if(ao2 != null){
          ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        boolean lb0 = true;
        double ld1 = 327.95578879627556;
        ab3 = ld1 > fd0;
        ab4 = !fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1, fb1, lb0, ab1, ab2);
}
        if (ab3) {
if(ao1 != null){
              ld1 = ao1.m3(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
            fd0 = fd1 - ld1;
            } else {
            if (ab1) {
if(fo1 != null){
                  ab2 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
                  fo0 = fo1.m4(fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
                fd1 *= -1;
                Thought lo2 = Thought87.getInstance();
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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    lb0 = fd0 < fd1;
    Output.points[4][7] += ad1;
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
if(fo0 != null){
      ad3 = fo0.m3();
}
    ad4 *= -1;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb0);
}
    double ld2 = 820.1957887614848;
    lb1 = ad3 < ad4;
    ab1 = ab2 || ab3;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld2, ad1, ad2);
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
    fd1 = fd0 - fd1;
    Output.points[4][8] -= fd0;
    boolean lb0 = true;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = true;
        lb0 = fd1 < fd0;
        fd1 *= -1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        lb1 = fd0 < fd1;
        double ld4 = 535.5832542017051;
if(fo0 != null){
          lb2 = fo0.m2(ld4, fd0, fd1, ld4, fb0, fb1, lb3, lb0);
}
        if (lb1) {
if(fo0 != null){
              fo1 = fo0.m4();
}
            lb2 = fb0 && fb1;
            lb3 = fd0 < fd1;
            lb0 = !lb1;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    ab2 = !ab3;
if(fo0 != null){
      fo0.m1(ab4, fb0, fb1, ab1);
}
    fd1 = fd0 - fd1;
    Output.points[5][0] -= fd0;
    boolean lb0 = true;
    Thought lo1 = Thought89.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    ab1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab2 = fd0 > fd1;
    ab3 = ab4 && fb0;
    for(int i0=0; i0<10; i0++){
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
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ad1;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2();
}
        ad4 = fd0 + fd1;
if(fo0 != null){
          fb0 = fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
        double ld0 = 145.04904293127024;
        ad4 = fd0 + fd1;
        fb1 = ld0 > ad1;
        Output.points[5][1] -= ad2;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        boolean lb1 = false;
        boolean lb2 = true;
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
    if (ab2) {
        ab3 = ab4 && fb0;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[5][2] -= fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          ad4 = fo1.m3();
}
        fb1 = fd0 > fd1;
        boolean lb0 = false;
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fd1 < fd0;
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    lb0 = !fb0;
    fb1 = fd1 > fd0;
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    Output.points[5][3] += fd1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      lb1 = ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    double ld2 = 694.2789376699965;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, fb0);
}
    fb1 = ld2 > fd0;
    boolean lb3 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, fd0, fd1);
}
    boolean lb4 = true;
    boolean lb5 = false;
    double ld6 = 154.42018704464775;
    lb0 = ld2 > ld6;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        double ld0 = 628.9668519453152;
        }
    fb0 = !fb1;
    fb0 = ad1 > ad2;
    double ld1 = 993.5236898215784;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd1 *= -1;
if(ao1 != null){
      ld1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought24.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ad1 = ao4.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    ld1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    boolean lb3 = true;
        lb3 = fd0 > fd1;
    Output.points[5][4] -= ld1;
    fb0 = fb1 || lb3;
if(ao2 != null){
      ad1 = ao2.m3(fb0, fb1, lb3, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ld1, ad1, ad2, fb1, lb3, fb0, fb1);
}
    lb3 = !fb0;
    Output.points[5][5] -= ad3;
    boolean lb4 = true;

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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    double ld0 = 795.0834132904711;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
    Thought lo1 = Thought55.getInstance(ao1, ao2, ao3, ao4);
    double ld2 = 214.99944645830342;
    boolean lb3 = true;
    Output.points[5][6] += ld2;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fb0 = fo0.m2(ld2, fd0, fd1, ld0, fb1, lb3, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab3 = ab4 && fb0;
    ld2 = fd0 - fd1;
    ld0 = ld2 - fd0;
    fb1 = !lb3;
    Thought lo4 = Thought56.getInstance(fd1, ld0, ld2, fd0);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ad2 = ad3 - ad4;
    double ld0 = 590.9737257797385;
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3);
}
    ab2 = !ab3;
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m3(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    ld0 = ad1 + ad2;

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
    fb1 = fd1 < fd0;
    Output.points[5][7] -= fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought75.getInstance(fb0, fb1, fb0, fb1);
    Thought lo1 = Thought85.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = true;
    fb0 = fd1 < fd0;
    boolean lb3 = true;
    Output.points[5][8] += fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    lb2 = lb3 || fb0;
    Thought lo4 = Thought68.getInstance(fd1, fd0, fd1, fd0);

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
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
    Output.points[6][0] -= fd0;
    Thought lo0 = Thought74.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought74.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
    boolean lb2 = false;
    ab1 = fd1 < fd0;
    Thought lo3 = Thought94.getInstance(fo1, fo0, fo1, fo0);
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb0, fb1, lb2, ab1);
}
    Output.points[6][1] += fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    boolean lb4 = false;
if(fo0 != null){
      fo0.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    if (lb4) {
        ab1 = ab2 && ab3;
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb2, lb4);
}
        fd1 *= -1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fb0 = fd0 < fd1;
        fd0 = fd1 + fd0;
        Output.points[6][2] += fd1;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 153.33524073620197;
    fd0 = fd1 - ld0;
    double ld1 = 630.4872257818777;
    ld1 = ad1 - ad2;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld0);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fb0 = fb1 && fb0;

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
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo1.m3();
}
    boolean lb1 = true;
    ab2 = ab3 || ab4;
    fb0 = fb1 || lb0;
    lb1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    double ld2 = 643.3360760751051;
    fb0 = ad4 > fd0;

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
    fb1 = fd0 < fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[6][3] += fd1;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought59.getInstance(fo0, fo1, ao1, ao2);
    Thought lo1 = Thought45.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    Thought lo2 = Thought75.getInstance(fb0, fb1, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    double ld3 = 449.1742366179234;
    fd0 = fd1 + ld3;
    fb0 = !fb1;
    double ld4 = 513.120119350863;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld4, fd0, fd1, ld3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Output.points[6][4] += ld4;
    fd0 = fd1 - ld3;
if(fo1 != null){
      fo0 = fo1.m4(ld4, fd0, fd1, ld3, fb0, fb1, fb0, fb1);
}

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
    fb0 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb0 = true;
        ad3 *= -1;
    double ld1 = 100.77684721736375;
    ad3 = ad4 + fd0;
    fb0 = fb1 && lb0;
    fd1 = ld1 - ad1;
if(ao3 != null){
      fb0 = ao3.m2(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao4.m3(fb1, lb0, fb0, fb1);
}
    Output.points[6][5] -= fd1;
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
    boolean lb2 = false;
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb0);
}
    lb2 = fb0 && fb1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
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
    ab1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        boolean lb0 = true;
        fb0 = fd0 < fd1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        double ld1 = 380.57827960967956;
if(fo0 != null){
          ao4 = fo0.m4(ld1, fd0, fd1, ld1);
}
        double ld2 = 877.3195768120903;
        for(int i1=0; i1<10; i1++){
if(ao1 != null){
              fo1 = ao1.m4(fb1, lb0, ab1, ab2);
}
if(ao2 != null){
              ab3 = ao2.m2(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld1);
}
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
            ab1 = ab2 || ab3;
            ab4 = fb0 && fb1;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
            Output.points[6][6] += ld2;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
            boolean lb3 = false;
            ab3 = ab4 && fb0;
            fb1 = fd0 > fd1;
            lb3 = lb0 && ab1;
            ab2 = ab3 && ab4;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao2.m1();
}
    boolean lb0 = true;
if(ao3 != null){
      ao3.m1(fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought27.getInstance(fb0, fb1, lb0, ab1);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
    Output.points[6][7] -= ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, ab1, ab2);
}
    Output.points[6][8] -= fd0;
    Thought lo2 = Thought56.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        double ld3 = 828.5014764454388;
if(ao1 != null){
          lb0 = ao1.m2();
}
        boolean lb4 = false;
        lb0 = ad4 > fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld3, ad1, ad2);
}
        Thought lo5 = Thought88.getInstance(ab1, ab2, ab3, ab4);
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld3, ad1, ad2, ad3, fb0, fb1, lb4, lb0);
}
        ab1 = ad4 > fd0;
        fd1 = ld3 - ad1;
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
    boolean lb0 = true;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    lb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb0;
    fb0 = fb1 || lb0;
    Thought lo1 = Thought31.getInstance(fb0, fb1, lb0, fb0);
    fb1 = fd1 < fd0;
    Thought lo2 = Thought20.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    boolean lb3 = true;
    lb0 = !lb3;
    Output.points[7][0] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb3);
}
    fb0 = fb1 && lb0;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb3);
}
    double ld4 = 49.03837041801145;
    boolean lb5 = true;
    Thought lo6 = Thought7.getInstance(fo0, fo1, fo0, fo1);
    lb5 = ld4 > fd0;
    fb0 = fb1 && lb0;

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
        boolean lb0 = true;
if(fo1 != null){
          fo1.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, ab1);
}
    ab2 = fd1 < fd0;
    Thought lo1 = Thought22.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    ab3 = ab4 || fb0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab1 = fo1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;

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
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought70.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
        fb0 = fd0 > fd1;
        Thought lo1 = Thought74.getInstance(fb1, fb0, fb1, fb0);
        fb1 = fb0 && fb1;
        Output.points[7][1] -= ad1;
        ad2 = ad3 + ad4;
        double ld2 = 343.87451988698126;
        boolean lb3 = false;
        Thought lo4 = Thought17.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2);
        lb3 = !fb0;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb3, fb0, fb1);
}
        fd1 = ld2 + ad1;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb3);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        ad3 = ad4 + fd0;
        fb0 = fb1 && lb3;
        fb0 = fb1 && lb3;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 - fd1;
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        fd1 *= -1;
        boolean lb0 = true;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
        Thought lo1 = Thought98.getInstance();
if(fo0 != null){
          fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
        ad4 *= -1;
        boolean lb2 = false;
if(fo0 != null){
          fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
        fb1 = lb0 || lb2;
        for(int i1=0; i1<10; i1++){
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
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[7][2] -= fd0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought7.getInstance(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    Thought lo2 = Thought93.getInstance(ao3, ao4, fo0, fo1);
    boolean lb3 = false;
    double ld4 = 529.915921082025;
if(ao2 != null){
      ao1 = ao2.m4(ld4, fd0, fd1, ld4, fb0, fb1, lb1, lb3);
}
    double ld5 = 158.85745462099052;
    ld5 = fd0 - fd1;
    ld4 *= -1;
    ld5 = fd0 + fd1;
    boolean lb6 = false;
if(ao3 != null){
      lb6 = ao3.m2();
}
    Thought lo7 = Thought36.getInstance(ld4, ld5, fd0, fd1);
    ld4 = ld5 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb1, lb3);
}
    lb6 = fb0 && fb1;
    fd1 *= -1;
    Thought lo8 = Thought16.getInstance(fo1, ao1, ao2, ao3, ld4, ld5, fd0, fd1);
    ld4 = ld5 - fd0;
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld4, ld5, fd0, lb3, lb6, fb0, fb1);
}
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1, lb3, lb6, fb0, fb1);
}
    lb1 = lb3 || lb6;
    Thought lo9 = Thought0.getInstance(ao2, ao3, ao4, fo0);

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
    ad2 = ad3 - ad4;
    fb1 = fb0 && fb1;
    double ld0 = 216.06420790345783;
    fb0 = ad4 > fd0;
    fb1 = !fb0;
    Thought lo1 = Thought50.getInstance(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    ad3 = ad4 + fd0;
    fb0 = !fb1;
    fb0 = fd1 < ld0;
    fb1 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ld0);
}
    ad1 = ad2 + ad3;
    Thought lo2 = Thought21.getInstance(fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
    Output.points[7][3] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = ab3 || ab4;
    boolean lb0 = true;
        double ld1 = 561.4270008277646;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ld1 *= -1;
    fd0 = fd1 + ld1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd1 = ao3.m3();
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1);
}
    fb0 = fb1 && ab1;
    ab2 = ad2 < ad3;
    ab3 = ad4 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(ab4, fb0, fb1, ab1);
}
    double ld0 = 744.3929695159973;
    fd0 = fd1 - ld0;
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    ab2 = fd1 < ld0;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    if (ab1) {
        boolean lb1 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld0, ad1, ad2, fb0, fb1, lb1, ab1);
}
        ab2 = ad3 > ad4;
if(ao3 != null){
          fd0 = ao3.m3();
}
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
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 258.42063741455104;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
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
    fb0 = !fb1;
    Output.points[7][4] += fd1;
    fd0 *= -1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought52.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fd1 *= -1;
    fb1 = !fb0;
    boolean lb1 = true;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fb0 = fo1.m2();
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
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
}
