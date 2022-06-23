package genetic;
import java.util.ArrayList;
class Thought55 extends Thought{
private static ArrayList<Thought55> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 226.35515091938288;
private double fd1 = 781.6968840408316;
private Thought fo0 = null;
private Thought fo1 = null;
Thought55 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought55 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought55 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought55 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought55 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought55 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought55 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought55 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought55 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought82.getInstance(fd1, fd0, fd1, fd0);
    Thought lo2 = Thought54.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    boolean lb3 = false;
if(fo1 != null){
      fo1.m3(lb3, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb3 = !fb0;
    double ld4 = 342.0097320746683;
    fd0 *= -1;
    fd1 *= -1;
    fb1 = lb0 || lb3;
    ld4 = fd0 - fd1;
    boolean lb5 = true;
    lb5 = ld4 < fd0;
    fd1 = ld4 - fd0;

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
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    ab2 = !ab3;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = fd1 < fd0;
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    boolean lb1 = false;
    fd0 *= -1;
    fd1 *= -1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    double ld2 = 184.90791661492005;

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
    boolean lb0 = true;
if(fo1 != null){
      ad2 = fo1.m3();
}
    Thought lo1 = Thought22.getInstance(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
    ad1 *= -1;
    boolean lb2 = false;
    lb2 = !fb0;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = !lb0;
    lb2 = ad1 > ad2;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, lb2, fb0);
}
    fb1 = lb0 && lb2;
    boolean lb3 = false;
    ad1 = ad2 - ad3;
    lb3 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
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
    double ld0 = 680.0337488321732;
    double ld1 = 956.0834185672568;
    ld1 = ad1 + ad2;
    ab1 = ad3 > ad4;
    ab2 = ab3 || ab4;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld1, ad1);
}
    if (fb0) {
        fb1 = ad2 < ad3;
        Thought lo2 = Thought89.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
        } else {
        ld1 = ad1 - ad2;
        ab1 = ab2 || ab3;
        ab4 = fb0 || fb1;
if(fo0 != null){
          ad3 = fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo1.m1();
}
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
        ab3 = !ab4;
        ld1 *= -1;
        ad1 = ad2 - ad3;
        fb0 = !fb1;
        ad4 = fd0 - fd1;
        boolean lb3 = false;
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
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
        lb0 = fd0 < fd1;
    double ld1 = 59.27326675983211;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    double ld2 = 216.44107290492957;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ld1, ld2, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    Thought lo3 = Thought74.getInstance(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
if(ao4 != null){
      ao3 = ao4.m4(ld1, ld2, fd0, fd1);
}
    ld1 = ld2 + fd0;
    fb0 = fb1 || lb0;
    double ld4 = 243.08682349405515;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ld2);
}
    double ld5 = 205.70196355971242;
if(fo0 != null){
      ld4 = fo0.m3(fb0, fb1, lb0, fb0);
}
    boolean lb6 = true;
    ld5 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(ao1 != null){
      ld1 = ao1.m3(ld2, ld4, ld5, fd0, fb1, lb0, lb6, fb0);
}
    fd1 *= -1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 378.16185167125235;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld2 = 947.4354622826154;
    fb0 = fb1 && lb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ld2, ad1, ad2, fb0, fb1, lb1, fb0);
}
    ad3 = ad4 - fd0;
    fb1 = fd1 > ld0;
    Output.points[4][4] -= ld2;
    lb1 = !fb0;
        fb1 = lb1 || fb0;
    ad1 = ad2 - ad3;
    fb1 = ad4 < fd0;
    Output.points[4][5] += fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
}
    fb0 = ld0 < ld2;
    Thought lo3 = Thought51.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 + ld0;
    fb1 = lb1 && fb0;

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
    fd1 = fd0 + fd1;
    ab1 = !ab2;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
        boolean lb0 = true;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      lb0 = ao1.m2();
}
        fd1 = fd0 - fd1;
    fd0 *= -1;
        fd1 = fd0 - fd1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 *= -1;
    lb1 = ab1 || ab2;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought95.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, lb0, lb1, ab1, ab2);
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
    ab1 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought55.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
    ab2 = fd1 > ad1;
    ad2 = ad3 - ad4;
if(ao2 != null){
      fd0 = ao2.m3(ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    Output.points[4][6] -= ad1;
if(ao3 != null){
      ao3.m3();
}
    ad2 = ad3 + ad4;
    ab1 = fd0 < fd1;
    ab2 = ad1 < ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    Output.points[4][7] += ad4;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb2 = true;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][8] += fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = fd0 > fd1;
    ab4 = fb0 || fb1;
    double ld0 = 103.77708740459008;
    Thought lo1 = Thought42.getInstance();
    Thought lo2 = Thought46.getInstance(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
    if (ab3) {
        ld0 = fd0 + fd1;
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
        ab2 = ab3 && ab4;
        fb0 = fb1 && ab1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
        Output.points[5][0] -= ld0;
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
            fd1 *= -1;
            ab2 = ld0 > fd0;
if(fo0 != null){
              ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
            ab2 = ab3 || ab4;
if(fo1 != null){
              fb0 = fo1.m2();
}
if(fo1 != null){
              fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
}}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    Thought lo0 = Thought3.getInstance(fo0, fo1, fo0, fo1);
    Thought lo1 = Thought46.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought23.getInstance(fd0, fd1, ad1, ad2);
    double ld3 = 382.8196294449445;
    fb1 = ad2 < ad3;
    ad4 = fd0 + fd1;
    ld3 = ad1 - ad2;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    boolean lb0 = true;
    lb0 = ab1 || ab2;
    ab3 = ab4 && fb0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, ab1, ab2);
}
    boolean lb1 = false;
if(fo0 != null){
      ad3 = fo0.m3();
}
    ab2 = ab3 && ab4;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb2, ab1, ab2, ab3);
}
    boolean lb3 = true;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb2);
}
    double ld4 = 962.055039429693;
    lb3 = ab1 || ab2;
    Thought lo5 = Thought7.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld4, ad1, ad2);
}
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
}
    boolean lb6 = false;
    lb0 = lb1 && lb2;
    boolean lb7 = false;
if(fo1 != null){
      ad3 = fo1.m3();
}
    Thought lo8 = Thought5.getInstance(ad4, fd0, fd1, ld4, lb3, lb6, lb7, ab1);

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
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[5][1] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    if (fb0) {
        Thought lo0 = Thought79.getInstance(fb1, fb0, fb1, fb0);
        fb1 = fb0 && fb1;
        fd1 = fd0 + fd1;
        fb0 = !fb1;
        fd0 *= -1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        fb0 = fb1 || fb0;
        fd1 *= -1;
        fb1 = fb0 && fb1;
if(ao4 != null){
          fd0 = ao4.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fd1 = fd0 + fd1;
        boolean lb1 = false;
        fd0 = fd1 - fd0;
        boolean lb2 = false;
        lb1 = fd1 < fd0;
        lb2 = fb0 && fb1;
        Thought lo3 = Thought87.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][2] -= ad2;
    Thought lo0 = Thought5.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb1 = fd1 < ad1;
    ad2 *= -1;
    double ld1 = 957.2709316732804;
    fb0 = !fb1;
    fb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 = fd0 - fd1;
    Output.points[5][3] -= fd0;
    ab2 = ab3 || ab4;
    fd1 *= -1;
    boolean lb0 = false;
    ab4 = fb0 && fb1;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    fd1 *= -1;
    ab4 = fb0 || fb1;
    boolean lb1 = true;
    lb0 = fd0 > fd1;
    lb1 = ab1 || ab2;
    ab3 = !ab4;
    fb0 = fd0 > fd1;
    fb1 = lb0 && lb1;
    double ld2 = 884.6379234191901;
if(fo1 != null){
              ld2 = fo1.m3(ao1, ao2, ao3, ao4);
}
    Output.points[5][4] += fd0;
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought25.getInstance(ao4, fo0, fo1, ao1, fb1, lb0, lb1, ab1);
if(ao3 != null){
      ao2 = ao3.m4(ld2, fd0, fd1, ld2);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1);
}
if(ao3 != null){
      ab2 = ao3.m2(ab3, ab4, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab2 = ad1 < ad2;
if(ao4 != null){
      ao4.m3(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
}
if(ao3 != null){
          ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
        Output.points[5][5] -= fd1;
        if (ab2) {
            Output.points[5][6] += ad1;
            double ld1 = 648.3024914124913;
            Output.points[5][7] -= ad1;
            if (ab3) {
                double ld2 = 440.00099846408557;
                ad1 *= -1;
                ab4 = !fb0;
                fb1 = ad2 > ad3;
                double ld3 = 843.0389349492184;
if(fo0 != null){
                  ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
                Output.points[5][8] += ld2;
if(ao4 != null){
                  ld3 = ao4.m3(lb0, ab1, ab2, ab3);
}
                ld1 = ad1 + ad2;
                Thought lo4 = Thought16.getInstance();
}}}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
    lb1 = !fb0;
    fb1 = lb0 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
    boolean lb2 = true;
    double ld3 = 912.357150977255;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
    fd0 = fd1 - ld3;
    lb1 = !lb2;
    fd0 = fd1 + ld3;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld3, fd0, fd1);
}
if(fo1 != null){
              ld3 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
}
    fd1 = ld3 - fd0;
    fd1 = ld3 + fd0;
    Output.points[6][0] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
    Output.points[6][1] -= ld3;
    lb2 = fd0 < fd1;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    Thought lo1 = Thought1.getInstance();
    Thought lo2 = Thought99.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
    boolean lb3 = true;
    ab3 = !ab4;
    Output.points[6][2] += fd0;
    fd1 *= -1;
    Output.points[6][3] += fd0;
    Output.points[6][4] -= fd1;
    fd0 *= -1;

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
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1();
}
    fb1 = ad3 < ad4;
    fb0 = fd0 > fd1;
    Output.points[6][5] += ad1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought2.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Output.points[6][6] -= fd0;
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        for(int i1=0; i1<10; i1++){
            boolean lb1 = true;
            double ld2 = 615.2529234241905;
if(fo1 != null){
              fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
            boolean lb3 = false;
            double ld4 = 210.74709077349624;
if(fo0 != null){
              fo0.m1(ld2, ld4, ad1, ad2);
}
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
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab1 = ab2 || ab3;
    boolean lb0 = true;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, ab1, ab2);
}
    double ld1 = 811.7330746163786;
    boolean lb2 = false;
if(fo0 != null){
      ld1 = fo0.m3();
}
    boolean lb3 = false;
    Thought lo4 = Thought58.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    Output.points[6][7] += fd0;
    double ld5 = 776.5825116406227;
    fb0 = fd0 < fd1;
    fb1 = lb0 || lb2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb6 = false;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ld5, ad1, ad2, ad3, lb3, lb6, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = ad4 > fd0;
    fd1 *= -1;

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
    boolean lb0 = true;
    Thought lo1 = Thought88.getInstance(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
    Output.points[6][8] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
        fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 + fd1;

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
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
    Output.points[7][0] -= fd0;
    fb1 = fb0 && fb1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
        ad2 *= -1;
    ad3 = ad4 - fd0;
    lb0 = fb0 && fb1;
    lb0 = fd1 > ad1;
    Output.points[7][1] -= ad2;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought98.getInstance();
    boolean lb2 = false;
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, lb3, fb0, fb1, lb0);
}
if(ao4 != null){
      lb2 = ao4.m2(fo0, fo1, ao1, ao2);
}
    boolean lb4 = false;
if(ao3 != null){
      lb3 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb4, fb0, fb1, lb0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, lb2, lb3, lb4, fb0);
}
    Output.points[7][2] += fd1;
    fb1 = ad1 < ad2;
    Output.points[7][3] -= ad3;
    lb0 = ad4 < fd0;

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
    Thought lo0 = Thought26.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    boolean lb2 = true;
    double ld3 = 130.59464459698438;
if(ao3 != null){
      ab4 = ao3.m2();
}
    Thought lo4 = Thought78.getInstance(fd0, fd1, ld3, fd0, fb0, fb1, lb1, lb2);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld3, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo5 = Thought33.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb2);
    boolean lb6 = false;
    lb6 = ld3 > fd0;
    Thought lo7 = Thought46.getInstance(fd1, ld3, fd0, fd1);
    ab1 = ld3 < fd0;
    ab2 = !ab3;
    Output.points[7][4] += fd1;
    ab4 = ld3 > fd0;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fd0 = ao2.m3(ab2, ab3, ab4, fb0);
}
    fd1 = ad1 - ad2;
if(ao4 != null){
      ao3 = ao4.m4();
}
    Output.points[7][5] += ad3;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
    double ld0 = 248.81468205843817;
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
if(ao4 != null){
      lb1 = ao4.m2(ad1, ad2, ad3, ad4);
}
    double ld2 = 771.1643668998986;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, ld2, ad1, ad2);
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
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || fb0;
    double ld0 = 716.4914122241088;
    fd0 = fd1 - ld0;
        boolean lb1 = true;
    fd0 = fd1 + ld0;
    boolean lb2 = false;
            Thought lo3 = Thought47.getInstance(fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb1);
    Thought lo4 = Thought23.getInstance(fo0, fo1, fo0, fo1);
    double ld5 = 389.038266017153;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld5, lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
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
    Thought lo0 = Thought4.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought86.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    ab2 = fd0 > fd1;
    ab3 = fd0 < fd1;
    Output.points[7][6] += fd0;
    fd1 *= -1;
    Thought lo2 = Thought61.getInstance(ab4, fb0, fb1, ab1);
if(fo1 != null){
      ab2 = fo1.m2();
}
    fd0 *= -1;
    boolean lb3 = true;
        ab2 = fd1 < fd0;
    ab3 = ab4 || fb0;

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
    Thought lo0 = Thought38.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    Output.points[7][7] += fd1;
    fb0 = ad1 < ad2;
    double ld1 = 107.41101860587432;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 || fb1;
    double ld2 = 125.34959524552953;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Thought lo3 = Thought0.getInstance(fd1, ld1, ld2, ad1);

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
    Output.points[7][8] += ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
    double ld0 = 976.7406338678142;
    double ld1 = 586.3042672469284;
if(fo0 != null){
      fo0.m2();
}
    fb1 = ab1 && ab2;
    Thought lo2 = Thought27.getInstance(ld0, ld1, ad1, ad2, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab1 = !ab2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = ld0 > ld1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ad1);
}
    ab2 = ad2 < ad3;

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
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2();
}
    fb1 = fd1 > fd0;
    boolean lb0 = false;
    Thought lo1 = Thought63.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
    Thought lo2 = Thought73.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fd1 *= -1;
    double ld3 = 110.71752812349416;
    fb1 = lb0 && fb0;
if(ao1 != null){
      ld3 = ao1.m3(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld3, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld3, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(lb0, fb0, fb1, lb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad1 *= -1;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
          fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
    boolean lb0 = false;
    Thought lo1 = Thought45.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
    Thought lo2 = Thought18.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    lb0 = fb0 || fb1;
    lb0 = !fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    ad1 *= -1;

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
    ab1 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      ab2 = ao1.m2();
}
    ab3 = fd0 > fd1;
    boolean lb0 = true;
    ab3 = ab4 || fb0;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    double ld1 = 994.5526379177913;
    ab3 = fd0 > fd1;
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
    ab4 = fd1 < ld1;
    boolean lb2 = true;
    boolean lb3 = false;
    fd0 = fd1 + ld1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ld1;
if(ao2 != null){
      ao2.m2(fd0, fd1, ld1, fd0);
}
    lb0 = !lb2;
    fd1 = ld1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1);
}
    ld1 = fd0 + fd1;
if(ao3 != null){
      ld1 = ao3.m3(lb3, ab1, ab2, ab3);
}
    double ld4 = 513.8891617744944;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      ld4 = fo1.m3(fd0, fd1, ld1, ld4, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 413.7762374178062;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
if(ao2 != null){
      ao2.m2(ld0, ad1, ad2, ad3);
}
    fb0 = fb1 || ab1;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
    boolean lb1 = true;
    ab1 = ad2 > ad3;
    ad4 = fd0 - fd1;
    Thought lo2 = Thought16.getInstance(ab2, ab3, ab4, fb0);
    boolean lb3 = false;
    double ld4 = 945.9498154838705;
    boolean lb5 = false;
    ld0 = ld4 - ad1;
if(ao2 != null){
      ao2.m3();
}
    Thought lo6 = Thought1.getInstance(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
    lb3 = !lb5;
    Thought lo7 = Thought30.getInstance(ao3, ao4, fo0, fo1);

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    double ld1 = 924.3824968858307;
    lb0 = fd0 < fd1;
        ld1 = fd0 - fd1;
    fb0 = !fb1;
    lb0 = fb0 || fb1;
    ld1 = fd0 - fd1;
    lb0 = ld1 > fd0;
    boolean lb2 = false;
    lb2 = fd1 < ld1;

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
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought63.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb2, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb2, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb3 = true;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        lb2 = lb3 && fb0;
    fb1 = lb0 || lb2;
if(fo0 != null){
      fd1 = fo0.m3(lb3, fb0, fb1, lb0);
}
    boolean lb4 = true;
if(fo1 != null){
      lb2 = fo1.m2();
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
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fb1 = !fb0;
    fd1 = fd0 + fd1;
    double ld0 = 726.2594917477328;
    Output.points[8][0] += ld0;
    fb1 = !fb0;
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 > ld0;
    Thought lo2 = Thought67.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
        lb1 = fb0 || fb1;
    lb1 = fd1 < ld0;
    Output.points[8][1] += fd0;
    fd1 *= -1;
    boolean lb3 = true;
    lb3 = ld0 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb3);
}
    double ld4 = 674.6967772377794;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld4, fd0, fd1);
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
