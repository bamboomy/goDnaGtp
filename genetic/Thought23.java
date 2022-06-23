package genetic;
import java.util.ArrayList;
class Thought23 extends Thought{
private static ArrayList<Thought23> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 562.2660079218044;
private double fd1 = 131.83992869760974;
private Thought fo0 = null;
private Thought fo1 = null;
Thought23 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought23 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought23 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought23 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought23 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought23 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought23 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought23 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought23 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought23 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought23 instance = new Thought23 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    ab1 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    double ld2 = 550.2741685253551;
    ab1 = !ab2;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb0 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    lb0 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb0 = lb1 && fb0;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 331.74048227923123;
    fb1 = fd0 < fd1;
    Thought lo3 = Thought13.getInstance(ld2, ad1, ad2, ad3);
if(fo0 != null){
      ad4 = fo0.m3(lb0, lb1, fb0, fb1);
}
    lb0 = !lb1;
    fb0 = fb1 || lb0;
    lb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1);
}
    ad2 = ad3 - ad4;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought61.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    double ld1 = 442.6750078764465;
if(fo1 != null){
      ab4 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
    ab3 = ab4 && fb0;
    Thought lo2 = Thought91.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ad1 = ad2 - ad3;
    Thought lo3 = Thought63.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
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
      fd1 = ao2.m3();
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      fb1 = ao3.m2(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought44.getInstance(fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    Thought lo1 = Thought34.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    fd0 *= -1;
    Thought lo2 = Thought87.getInstance(fo1, ao1, ao2, ao3);
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Thought lo3 = Thought10.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    Thought lo4 = Thought27.getInstance();
    double ld5 = 869.6273737097694;
    Thought lo6 = Thought36.getInstance(fd0, fd1, ld5, fd0);
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo7 = Thought67.getInstance(fo1, ao1, ao2, ao3, fd1, ld5, fd0, fd1);
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ld5, fd0, fd1, ld5, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo8 = Thought69.getInstance(fd1, ld5, fd0, fd1, fb0, fb1, fb0, fb1);
    ld5 = fd0 + fd1;
    Output.points[3][3] -= ld5;

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
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && fb0;
if(ao1 != null){
          fb1 = ao1.m2();
}
        boolean lb0 = false;
if(ao3 != null){
          ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
        lb0 = !fb0;
        fb1 = lb0 && fb0;
        fb1 = ad1 < ad2;
        ad3 = ad4 - fd0;
        lb0 = !fb0;
        boolean lb1 = true;
        fd1 = ad1 + ad2;
        fb0 = !fb1;
if(ao4 != null){
          lb0 = ao4.m2(lb1, fb0, fb1, lb0);
}
        boolean lb2 = false;
        double ld3 = 758.3249601515179;
        ad2 *= -1;
        double ld4 = 859.4545860482531;
        lb1 = lb2 && fb0;
        ad2 = ad3 - ad4;
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld3, ld4, ad1);
}
        ad2 = ad3 + ad4;
        fd0 = fd1 + ld3;
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
    Output.points[3][4] -= fd1;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought10.getInstance(ao2, ao3, ao4, fo0);
    fb1 = !ab1;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Output.points[3][5] += fd0;
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought8.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fd1 < fd0;
    fb1 = !ab1;
    ab2 = fd1 < fd0;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
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
    Output.points[3][6] += ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + ad1;
    Thought lo0 = Thought25.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought58.getInstance();
    for(int i0=0; i0<10; i0++){
        ab2 = ab3 && ab4;
        ad1 = ad2 + ad3;
        ad4 *= -1;
        if (fb0) {
if(ao1 != null){
              fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
            boolean lb2 = true;
if(ao2 != null){
              ad3 = ao2.m3(fb0, fb1, lb2, ab1);
}
if(ao3 != null){
              ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
            ab2 = ab3 || ab4;
            Thought lo3 = Thought42.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb2, ab1);
            fd1 = ad1 + ad2;
            ad3 = ad4 - fd0;
            if (ab2) {
                fd1 = ad1 - ad2;
if(fo1 != null){
                  fo1.m2(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
                  lb2 = fo0.m2(fo1, ao1, ao2, ao3);
}
                double ld4 = 871.8434305215512;
                Thought lo5 = Thought50.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(ao4 != null){
                  ao4.m3();
}
if(fo1 != null){
                  fo0 = fo1.m4(fd1, ld4, ad1, ad2);
}
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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    Output.points[3][7] -= fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought14.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    boolean lb2 = true;
    lb2 = fd0 > fd1;
    Output.points[3][8] += fd0;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}

Thought.STACK_COUNTER++;
return lb3;
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
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    Output.points[4][0] += fd1;
        fd0 = fd1 - fd0;
    ab2 = !ab3;
    boolean lb0 = true;
    boolean lb1 = false;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    ab2 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    lb1 = fd1 > fd0;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    boolean lb0 = false;
    fd0 = fd1 + ad1;
    Thought lo1 = Thought92.getInstance();
    ad2 = ad3 + ad4;
    fb0 = fb1 || lb0;
    fb0 = fd0 < fd1;
    Thought lo2 = Thought60.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fd0 = fo0.m3(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    Output.points[4][1] -= ad1;
    lb0 = ad2 < ad3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    Thought lo3 = Thought61.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
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
    ad2 *= -1;
    ab1 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2();
}
    ab1 = ad3 > ad4;
    Output.points[4][2] -= fd0;
    Output.points[4][3] += fd1;
    ad1 *= -1;
    if (ab2) {
        ab3 = ad2 > ad3;
        ad4 = fd0 + fd1;
        for(int i0=0; i0<10; i0++){
            ab4 = ad1 < ad2;
            fb0 = ad3 > ad4;
            }
        fb1 = ab1 || ab2;
if(fo0 != null){
          ab3 = fo0.m2(fd0, fd1, ad1, ad2);
}
        Thought lo0 = Thought92.getInstance(ab4, fb0, fb1, ab1);
        Thought lo1 = Thought23.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
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
        fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 832.5662468985186;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought34.getInstance(ao1, ao2, ao3, ao4);
    fd0 = fd1 + ld0;
    fb1 = fd0 > fd1;
    fb0 = ld0 > fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ld0 < fd0;
if(fo1 != null){
      fb1 = fo1.m2();
}
if(ao1 != null){
      fb0 = ao1.m2(fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
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
    fb1 = fb0 && fb1;
    Thought lo0 = Thought63.getInstance(ao2, ao3, ao4, fo0);
    fb0 = fb1 || fb0;
    fb1 = ad1 > ad2;
    fb0 = fb1 && fb0;
    boolean lb1 = true;
    Thought lo2 = Thought64.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
    double ld3 = 46.51176548119381;
if(fo1 != null){
      fo1.m3();
}
    ld3 = ad1 - ad2;
    Output.points[4][4] += ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ld3, ad1, ad2, ad3);
}
    fb1 = lb1 || fb0;
    fb1 = ad4 > fd0;
    double ld4 = 322.96352439098393;
    lb1 = fd0 > fd1;
if(ao3 != null){
      ao3.m1(fb0, fb1, lb1, fb0);
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
    boolean lb0 = true;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    double ld1 = 5.751723591509843;
    boolean lb2 = false;
    Thought lo3 = Thought52.getInstance(fo1, ao1, ao2, ao3);
    ab4 = fd0 < fd1;
    ld1 *= -1;

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
    Output.points[4][5] -= ad2;
    ad3 *= -1;
    if (ab2) {
        if (ab3) {
            boolean lb0 = true;
            double ld1 = 179.6565336661455;
if(ao3 != null){
              ao2 = ao3.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
            lb0 = ab1 && ab2;
            ld1 *= -1;
            Thought lo2 = Thought70.getInstance();
if(ao4 != null){
              ao4.m1(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
              fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(ao1 != null){
              fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld1, ad1, ad2);
}
            lb0 = ab1 && ab2;
            Thought lo3 = Thought49.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
            Thought lo4 = Thought64.getInstance(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
            ld1 *= -1;
            ad1 = ad2 + ad3;
            ab4 = ad4 > fd0;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    boolean lb1 = true;
    lb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    Thought lo2 = Thought79.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fd0 < fd1;
    double ld3 = 472.6110195290423;
    lb0 = !lb1;
    fb0 = ld3 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld3, fd0, fd1, ld3);
}
    fb1 = lb0 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0);
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
    Thought lo0 = Thought40.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
    double ld1 = 40.96645067339479;
    Thought lo2 = Thought14.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    double ld3 = 110.56083974717096;
    double ld4 = 207.34348499154498;
    fb1 = ld1 > ld3;
    ld4 = fd0 + fd1;
    ld1 = ld3 - ld4;
    boolean lb5 = false;
    Thought lo6 = Thought86.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo1 = fo0.m4(ld3, ld4, fd0, fd1, lb5, ab1, ab2, ab3);
}
if(fo1 != null){
      ld1 = fo1.m3();
}
    boolean lb7 = true;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
        fb1 = ad1 < ad2;
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Output.points[4][6] += fd1;
    ad1 = ad2 + ad3;
    fb0 = fb1 && fb0;
    ad4 *= -1;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd1 = ad1 + ad2;
    fb1 = !ab1;
    ad3 *= -1;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab2 = fo1.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3();
}
        ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, ab1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    double ld0 = 655.3247726040435;
    Output.points[4][7] -= fd0;
    fb1 = fb0 || fb1;
    fb0 = fd1 < ld0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    if (fb1) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
        ld0 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        boolean lb1 = false;
        double ld2 = 5.983117924706675;
        for(int i0=0; i0<10; i0++){
            lb1 = ld0 > fd0;
            fd1 = ld2 + ld0;
}}
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
    boolean lb0 = true;
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    Thought lo1 = Thought90.getInstance();
    Thought lo2 = Thought71.getInstance(fd0, fd1, ad1, ad2);
    fb1 = ad3 > ad4;
    fd0 = fd1 - ad1;
    boolean lb3 = false;
if(ao2 != null){
      ad2 = ao2.m3(lb0, lb3, fb0, fb1);
}
    double ld4 = 847.8918100759944;
    double ld5 = 619.7792932624083;

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
    boolean lb0 = false;
        fd1 = fd0 + fd1;
    Thought lo1 = Thought30.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    lb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    ab4 = !fb0;
    Thought lo3 = Thought70.getInstance(fo0, fo1, ao1, ao2);
    fb1 = !lb0;
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    boolean lb4 = true;
    ab4 = fb0 || fb1;
    lb0 = lb2 || lb4;
    double ld5 = 45.13866643311376;
    Thought lo6 = Thought67.getInstance(ld5, fd0, fd1, ld5);
    boolean lb7 = true;
    boolean lb8 = false;
    Output.points[4][8] -= fd0;
if(fo1 != null){
      fo1.m1(lb7, lb8, ab1, ab2);
}
    fd1 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ld5, fd0, fd1, ld5);
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
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
    Output.points[5][0] -= ad1;
        ab4 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      ao4 = fo0.m4();
}
    Output.points[5][1] -= fd1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab4 = !fb0;
    fd0 *= -1;
    fb1 = fd1 < ad1;
    Output.points[5][2] += ad2;
    boolean lb0 = true;
    double ld1 = 576.1762915585886;
    double ld2 = 647.4025334084006;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    lb0 = !lb1;
    fd1 = fd0 + fd1;
    if (fb0) {
        fd0 = fd1 - fd0;
        } else {
        fb1 = fd1 > fd0;
        fd1 = fd0 + fd1;
        boolean lb2 = false;
        fd0 = fd1 - fd0;
        double ld3 = 32.933500238605156;
        fd0 *= -1;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        ld3 = fd0 - fd1;
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
    boolean lb0 = true;
    Thought lo1 = Thought17.getInstance(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m3();
}
    ab4 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[5][3] += fd0;

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
    fb0 = ad2 > ad3;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought83.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    ad2 = ad3 + ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ad1;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
    ad2 *= -1;
    Output.points[5][4] += ad3;
    double ld2 = 212.72998538322744;

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
    ab2 = ab3 || ab4;
    double ld0 = 421.133729597545;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;
    fd0 = fd1 + ld0;
    ab2 = !ab3;
if(fo1 != null){
      fo1.m2();
}
        ab4 = fb0 || fb1;
    lb1 = !ab1;
if(fo0 != null){
      ab2 = fo0.m2(ad1, ad2, ad3, ad4);
}
    boolean lb2 = false;
    ab2 = ab3 && ab4;

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
    fb0 = fb1 || fb0;
    if (fb1) {
        Output.points[5][5] += fd1;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        fb1 = fb0 && fb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
        boolean lb0 = true;
        lb0 = fd0 > fd1;
        boolean lb1 = true;
if(ao3 != null){
          lb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
        fd0 *= -1;
        Output.points[5][6] += fd1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought3.getInstance();
    double ld1 = 322.6682493118424;
    for(int i0=0; i0<10; i0++){
        }
if(ao2 != null){
      ao1 = ao2.m4(ld1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    ld1 = ad1 - ad2;
    Thought lo2 = Thought94.getInstance(fb0, fb1, fb0, fb1);
    ad3 = ad4 - fd0;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    Thought lo3 = Thought79.getInstance(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2);
    fb1 = fb0 || fb1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought63.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    double ld1 = 40.09506280068484;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fd1 = ld1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld1, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought96.getInstance();
if(fo1 != null){
      ab4 = fo1.m2(fd0, fd1, ld1, fd0);
}
        Thought lo3 = Thought62.getInstance(fb0, fb1, ab1, ab2);
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        fd0 = fd1 + ld1;
if(ao1 != null){
          lb4 = ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
        fb0 = fd0 < fd1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        fb1 = ld1 > fd0;
        lb4 = !ab1;
        boolean lb5 = false;
        Output.points[5][7] += fd1;
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
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m1();
}
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, ab1, ab2);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    Thought lo0 = Thought73.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
    ab3 = ab4 && fb0;
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > ad1;
    fb0 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        ad4 = fd0 + fd1;
        ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2();
}
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    ab3 = ad3 > ad4;

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
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
    boolean lb2 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    lb2 = fb0 || fb1;
    lb0 = fd0 > fd1;
    lb1 = !lb2;
    boolean lb3 = true;
    lb3 = !fb0;
    fb1 = lb0 && lb1;
    fd0 *= -1;
    double ld4 = 864.550188135994;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld4, fd0, lb2, lb3, fb0, fb1);
}
    fd1 = ld4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = ld4 + fd0;
    lb0 = fd1 < ld4;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought46.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    Output.points[5][8] -= fd0;
    fd1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld1 = 295.8725226853112;
    Thought lo2 = Thought69.getInstance(fo1, fo0, fo1, fo0);
    fb1 = ld1 > fd0;
    Thought lo3 = Thought89.getInstance(fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3();
}
    Output.points[6][0] += ld1;
    Thought lo4 = Thought68.getInstance(fd0, fd1, ld1, fd0);
    fd1 *= -1;
    ld1 *= -1;
    fb0 = fb1 || fb0;
    double ld5 = 206.24835834324222;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    ld5 *= -1;
    boolean lb6 = false;
    boolean lb7 = false;
if(fo0 != null){
      lb7 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld5);
}
    double ld8 = 924.718339291131;

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
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    fb1 = !fb0;
    fd0 = fd1 + fd0;
    fb1 = !fb0;
    fb1 = fd1 < fd0;
        fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
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
