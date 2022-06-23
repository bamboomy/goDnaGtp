package genetic;
import java.util.ArrayList;
class Thought26 extends Thought{
private static ArrayList<Thought26> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 64.5862196554429;
private double fd1 = 764.7781991212796;
private Thought fo0 = null;
private Thought fo1 = null;
Thought26 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought26 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought26 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought26 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought26 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought26 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought26 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought26 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought26 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld1 = 154.2744704505947;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;
    fb0 = fd0 < fd1;
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb2, fb0);
}
    fb1 = lb0 || lb2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld1, fd0, fd1, fb1, lb0, lb2, fb0);
}
    Output.points[4][5] += ld1;
    boolean lb3 = true;
    Output.points[4][6] += fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m3();
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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fb1 = fd0 > fd1;
    Thought lo1 = Thought93.getInstance(lb0, ab1, ab2, ab3);
    Thought lo2 = Thought0.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    Thought lo3 = Thought76.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    double ld4 = 962.0578407098302;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld4, fd0, fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld4, fd0, fd1);
}
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, lb0, ab1);
}
    Output.points[4][7] += ld4;
    double ld5 = 145.16262763449035;
if(fo1 != null){
      ld5 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld4, ld5);
}
    Thought lo6 = Thought67.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld4, ld5, ab2, ab3, ab4, fb0);
    fb1 = !lb0;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld4, ld5, fb1, lb0, ab1, ab2);
}
    ab3 = !ab4;

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
      ad1 = fo1.m3();
}
    ad2 = ad3 + ad4;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    ad4 *= -1;
    fb0 = fb1 && lb0;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb1 = false;
    lb1 = !fb0;
    fb1 = lb0 && lb1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
        fb0 = ad1 < ad2;
        ad3 *= -1;
        Thought lo2 = Thought12.getInstance(fo0, fo1, fo0, fo1);
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
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    Thought lo0 = Thought77.getInstance(ad3, ad4, fd0, fd1);
    ad1 *= -1;
    double ld1 = 961.6017395417867;
    ad1 = ad2 - ad3;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
    ab4 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fd1 = ld1 - ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ld1;

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
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    if (fb0) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
        Output.points[4][8] -= fd0;
        lb0 = !fb0;
        Output.points[5][0] += fd1;
        fb1 = fd0 > fd1;
        lb0 = fd0 > fd1;
        fd0 = fd1 - fd0;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
        boolean lb1 = false;
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
    fb1 = fb0 && fb1;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
    Thought lo0 = Thought1.getInstance();
    Output.points[5][1] += ad3;
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao4.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    boolean lb1 = false;
    ad1 = ad2 - ad3;
    Thought lo2 = Thought9.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
    double ld3 = 932.3029230257267;
    ad1 *= -1;
    fb1 = ad2 < ad3;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ad4, fd0, fd1, ld3, fb1, lb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m2();
}
    ad1 *= -1;
    ad2 = ad3 - ad4;
    Output.points[5][2] -= fd0;
    fd1 = ld3 - ad1;
    ad2 = ad3 + ad4;
    Thought lo4 = Thought13.getInstance(fd0, fd1, ld3, ad1);
    ad2 = ad3 - ad4;
    fd0 = fd1 + ld3;
if(ao2 != null){
      ao2.m1(lb1, fb0, fb1, lb1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
        Output.points[5][3] += fd1;
        boolean lb0 = false;
        Output.points[5][4] += fd0;
        ab4 = fd1 < fd0;
        double ld1 = 684.5986982987832;
        fd0 = fd1 + ld1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, fd0, fb0, fb1, lb0, ab1);
}
        fd1 *= -1;
        boolean lb2 = false;
        double ld3 = 85.05756162976353;
if(ao1 != null){
          ld1 = ao1.m3();
}
        ab1 = ld3 < fd0;
if(ao2 != null){
          fd1 = ao2.m3(ld1, ld3, fd0, fd1);
}
        double ld4 = 341.9601804666131;
        ab2 = !ab3;
        ld1 = ld3 + ld4;
        double ld5 = 773.8100342829513;
        ld5 *= -1;
        ab4 = !fb0;
        }
    boolean lb6 = false;
    ab1 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
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
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    if (ab1) {
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
        ab2 = ab3 && ab4;
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
        ad3 *= -1;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 || ab3;
        ab4 = !fb0;
        Output.points[5][5] += ad4;
        fb1 = ab1 && ab2;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ab3 = ao3.m2(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
        ab2 = ad3 < ad4;
        Thought lo0 = Thought76.getInstance();
        ab3 = ab4 && fb0;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ad1, ad2);
}
        boolean lb1 = true;
if(ao1 != null){
          fo1 = ao1.m4(fb0, fb1, lb1, ab1);
}
        for(int i0=0; i0<10; i0++){
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb1, ab1, ab2);
}
            ab3 = fd0 > fd1;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    Thought lo0 = Thought60.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
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
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    fd0 = fd1 - fd0;
    ab2 = fd1 > fd0;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    double ld0 = 748.775330667968;
    ab4 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought53.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
    ab3 = !ab4;
    fd0 *= -1;
    Thought lo2 = Thought70.getInstance();
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3(fb1, ab1, ab2, ab3);
}
    Output.points[5][6] -= fd0;
    Output.points[5][7] -= fd1;
    ab4 = fb0 || fb1;
    Thought lo3 = Thought75.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;

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
    double ld0 = 762.2632863711603;
    Thought lo1 = Thought12.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    ld0 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ld0 = ad1 + ad2;
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    double ld2 = 291.2478649047671;
    fb0 = ld0 > ld2;
    fb1 = !fb0;
    boolean lb3 = false;
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld2, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3(fb1, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    boolean lb0 = true;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[5][8] -= ad1;
    for(int i0=0; i0<10; i0++){
        Output.points[6][0] += ad2;
        Thought lo1 = Thought47.getInstance(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
        double ld2 = 540.3079885058379;
        ab1 = ab2 && ab3;
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
    if (fb1) {
        fb0 = fd0 > fd1;
        boolean lb0 = false;
        fd0 = fd1 + fd0;
if(ao3 != null){
          ao2 = ao3.m4();
}
        boolean lb1 = false;
if(fo0 != null){
          ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fd1 = fo1.m3(lb1, fb0, fb1, lb0);
}
        Output.points[6][1] += fd0;
        lb1 = fb0 && fb1;
        fd1 = fd0 + fd1;
        boolean lb2 = true;
        Thought lo3 = Thought75.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
        lb0 = fd0 < fd1;
        boolean lb4 = true;
        Thought lo5 = Thought46.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb1, lb2, lb4, fb0);
        boolean lb6 = false;
        Output.points[6][2] -= fd0;
        Output.points[6][3] -= fd1;
        Output.points[6][4] += fd0;
        fb0 = fb1 || lb0;
        lb1 = !lb2;
        fd1 = fd0 + fd1;
if(ao3 != null){
          lb4 = ao3.m2(ao4, fo0, fo1, ao1, lb6, fb0, fb1, lb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 < fd1;
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    ad4 *= -1;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    lb1 = fb0 && fb1;
    lb0 = lb1 || fb0;
    fb1 = lb0 && lb1;
    boolean lb2 = false;
if(fo1 != null){
      lb2 = fo1.m2(fb0, fb1, lb0, lb1);
}
    fd1 = ad1 - ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    lb2 = ad1 < ad2;
    ad3 = ad4 - fd0;
    Thought lo3 = Thought2.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
    ad4 *= -1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb0);
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
    boolean lb1 = false;
    Thought lo2 = Thought46.getInstance(ao2, ao3, ao4, fo0);
    fd0 = fd1 + fd0;
    lb0 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m1();
}
    fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    ab4 = fb0 || fb1;

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
    boolean lb0 = false;
    Thought lo1 = Thought74.getInstance(ab1, ab2, ab3, ab4);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fb0 = fd1 > ad1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    double ld2 = 318.8404215295066;
    Thought lo3 = Thought31.getInstance(ld2, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
    lb0 = ab1 && ab2;
if(ao4 != null){
      ad4 = ao4.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld2, ad1, ad2);
}
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4, ld2, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 - fd1;
    lb0 = ld2 < ad1;
    Thought lo4 = Thought68.getInstance(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
    Thought lo5 = Thought48.getInstance(ao3, ao4, fo0, fo1);
    Thought lo6 = Thought79.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
        ab2 = fd1 < ld2;
    ab3 = ad1 > ad2;
    Thought lo7 = Thought4.getInstance();
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
          ab4 = ao3.m2(fb0, fb1, lb0, ab1);
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
        lb0 = fb0 && fb1;
        lb0 = fb0 && fb1;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        lb0 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        fd0 = fd1 - fd0;
        fd1 *= -1;
        fb0 = fb1 || lb0;
        Output.points[6][5] += fd0;
        fd1 *= -1;
        Thought lo1 = Thought67.getInstance();
        fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        boolean lb2 = false;
        fd0 = fd1 - fd0;
        Output.points[6][6] += fd1;
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
    boolean lb0 = false;
    double ld1 = 9.191756293926018;
    double ld2 = 212.63346626275933;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1);
}
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    lb0 = ab1 || ab2;
    boolean lb3 = true;

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
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        Output.points[6][7] += fd1;
    double ld0 = 797.969217758478;
if(fo0 != null){
      fo0.m2();
}
    fb0 = ld0 > ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, ad1);
}
    boolean lb1 = true;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb1, fb0);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
    fb0 = fb1 || lb1;
    lb2 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought23.getInstance(ld0, ad1, ad2, ad3, lb1, lb2, fb0, fb1);

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ad2 = ad3 - ad4;
    Output.points[6][8] -= fd0;
    Output.points[7][0] += fd1;
    ab4 = ad1 > ad2;
    fb0 = !fb1;
    boolean lb0 = true;
if(fo1 != null){
      ad3 = fo1.m3();
}
    lb0 = !ab1;
    ab2 = !ab3;
    ad4 = fd0 + fd1;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    double ld1 = 978.4797841943066;
    lb0 = !ab1;
    boolean lb2 = false;
    ad4 = fd0 - fd1;

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
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        double ld0 = 828.0309556740568;
        Thought lo1 = Thought93.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        Thought lo2 = Thought81.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
        Thought lo3 = Thought86.getInstance();
        ld0 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(ao1 != null){
          ao1.m2(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        fb1 = fd0 > fd1;
        fb0 = !fb1;
        Output.points[7][1] += ld0;
        fd0 *= -1;
        fb0 = fb1 || fb0;
        double ld4 = 690.509488431838;
        for(int i1=0; i1<10; i1++){
            Output.points[7][2] -= fd0;
            Output.points[7][3] += fd1;
            fb1 = fb0 && fb1;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ld4, fd0, fd1);
}
if(ao2 != null){
              ao2.m3(ao3, ao4, fo0, fo1, ld0, ld4, fd0, fd1, fb0, fb1, fb0, fb1);
}
            fb0 = !fb1;
            ld0 = ld4 - fd0;
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
    fb0 = !fb1;
    ad1 = ad2 - ad3;
    Thought lo0 = Thought36.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    if (fb0) {
        fb1 = fb0 && fb1;
        Output.points[7][4] += ad4;
        fb0 = fb1 || fb0;
        } else {
        fd0 = fd1 + ad1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        fb1 = ad2 < ad3;
if(fo0 != null){
          fo0.m1(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
        ad2 *= -1;
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
    double ld1 = 963.5926242182036;
    fd0 = fd1 + ld1;
    fd0 *= -1;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld1, fd0, fd1);
}
    ld1 = fd0 - fd1;
    lb0 = ld1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    Output.points[7][5] -= ld1;
    Thought lo3 = Thought0.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    lb2 = ld1 < fd0;
    ab1 = fd1 < ld1;
    boolean lb4 = true;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    lb2 = lb4 || ab1;
if(ao3 != null){
      ao3.m2(fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fd1 = ao4.m3();
}
    fb1 = lb0 && lb2;

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
    ad2 *= -1;
    ab1 = !ab2;
    boolean lb0 = true;
    ab2 = ab3 && ab4;
    boolean lb1 = true;
    ab4 = fb0 || fb1;
    lb0 = lb1 && ab1;
    Thought lo2 = Thought36.getInstance(ad3, ad4, fd0, fd1);
    double ld3 = 888.4714425894417;
    ab2 = ld3 > ad1;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    ad2 = ad3 + ad4;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld3, ad1);
}
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ld3;
    ad1 = ad2 - ad3;
    boolean lb4 = false;
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, lb4, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld3, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m1();
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4);
}
        lb0 = fd0 < fd1;
    ld3 = ad1 - ad2;
    lb1 = !lb4;

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
    double ld0 = 283.62921951829844;
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ld0 > fd0;
    double ld1 = 668.0530517691651;
    fd0 *= -1;
        fd1 = ld0 + ld1;
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
    fb1 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;

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
    double ld0 = 18.652411892249493;
    Thought lo1 = Thought66.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
    fd0 = fd1 + ld0;
    fb0 = fd0 < fd1;
    fb1 = ld0 > fd0;
    fd1 = ld0 - fd0;
        fd1 = ld0 - fd0;
    fd1 *= -1;
    lb2 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = true;
if(fo0 != null){
      fo0.m2(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    Thought lo4 = Thought94.getInstance(lb3, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    double ld5 = 328.4552367272158;
    fd0 *= -1;
    ab4 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld0, fb0, fb1, lb2, lb3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld5 = fd0 + fd1;
    double ld6 = 709.9522610637255;
    ld0 = ld5 + ld6;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld5, fb0, fb1, lb2, lb3);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 561.9987929026373;
    fb0 = fb1 || fb0;
    fb1 = ld0 > ad1;
        Thought lo1 = Thought80.getInstance();
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;
    fb0 = fb1 || fb0;
    ad1 *= -1;
    double ld2 = 841.3606722861779;
        ad1 = ad2 - ad3;
    ad4 *= -1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    ab2 = ab3 && ab4;
    fb0 = fd1 > ad1;
if(fo1 != null){
      ad2 = fo1.m3(fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought86.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    Thought lo1 = Thought95.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fd0 = fo1.m3();
}
    double ld2 = 457.24348262615416;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld2, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m1(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2);
}
    ad1 = ad2 + ad3;
    boolean lb3 = true;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb4 = true;
    ab4 = !fb0;

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
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    double ld0 = 184.94357905102316;
    fb1 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb1 = ld0 > fd0;
    fb0 = fd1 < ld0;
    fd0 = fd1 - ld0;
    boolean lb1 = false;
    boolean lb2 = true;
    lb2 = fb0 && fb1;

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
        ad2 = ad3 + ad4;
    boolean lb0 = true;
if(ao1 != null){
      lb0 = ao1.m2(fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao2.m1(fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fb0 = ad3 > ad4;
    fb1 = !lb0;
    fd0 = fd1 + ad1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    lb1 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought64.getInstance(ao1, ao2, ao3, ao4, lb0, lb1, fb0, fb1);
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb0, lb1, fb0, fb1);
}
    double ld3 = 814.3473609487872;
    lb0 = lb1 && fb0;
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao2 != null){
      ao2.m1(fd1, ld3, ad1, ad2);
}
    ad3 *= -1;

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
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1);
}
    ab3 = fd0 < fd1;
    Thought lo0 = Thought11.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
    ab2 = fd0 > fd1;
if(ao2 != null){
      ao2.m1();
}
if(ao3 != null){
      ao3.m1(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
    boolean lb1 = true;

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
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought35.getInstance(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
    Thought lo1 = Thought72.getInstance();
if(ao2 != null){
      ab2 = ao2.m2(fd1, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m3(ab3, ab4, fb0, fb1);
}
        ab1 = ad4 > fd0;
        ab2 = !ab3;
        boolean lb2 = true;
        Thought lo3 = Thought28.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
        ad2 = ad3 + ad4;
        double ld4 = 480.65827302528226;
        lb2 = ab1 && ab2;
        ab3 = ad4 > fd0;
        double ld5 = 73.55789704920493;
        ab4 = !fb0;
        double ld6 = 446.14021300183566;
        fb1 = !lb2;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
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
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
        fb0 = fb1 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
        fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought90.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    double ld1 = 82.87084026407656;
    double ld2 = 309.3912528771476;
    Output.points[7][6] -= ld1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
    ld2 = fd0 + fd1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0);
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
    double ld0 = 504.7378102338908;
    boolean lb1 = false;
    Thought lo2 = Thought91.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
    boolean lb3 = false;
    double ld4 = 178.02986828892122;
if(fo1 != null){
          fo1.m3();
}
    ld4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld4, fd0, fd1);
}
    Thought lo5 = Thought30.getInstance(fb0, fb1, lb1, lb3);
    Thought lo6 = Thought82.getInstance(fo0, fo1, fo0, fo1, ld0, ld4, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld4, fd0, fd1, fb0, fb1, lb1, lb3);
}
    fb0 = fb1 || lb1;
    double ld7 = 999.6646365006372;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb1);
}
    Thought lo8 = Thought36.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m3(ld0, ld4, ld7, fd0, lb3, fb0, fb1, lb1);
}
    fd1 *= -1;
    ld0 = ld4 + ld7;
    lb3 = fd0 < fd1;
    ld0 = ld4 - ld7;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd0 > fd1;
    ld0 = ld4 - ld7;
    fb1 = lb1 && lb3;
    fb0 = !fb1;
    lb1 = lb3 && fb0;

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
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
    boolean lb2 = true;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[7][7] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, lb2, fb0);
}
    boolean lb3 = true;
    fb0 = !fb1;
    Thought lo4 = Thought6.getInstance(fo0, fo1, fo0, fo1);
    lb0 = lb1 || lb2;
    Thought lo5 = Thought5.getInstance(fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb0);
    lb1 = fd0 < fd1;
    fd0 *= -1;
    boolean lb6 = false;
    Thought lo7 = Thought54.getInstance();
    lb2 = lb3 || lb6;
    fb0 = !fb1;
    lb0 = lb1 || lb2;
    lb3 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo8 = Thought24.getInstance(lb6, fb0, fb1, lb0);
    boolean lb9 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
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
