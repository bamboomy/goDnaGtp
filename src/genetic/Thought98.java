package genetic;
import java.util.ArrayList;
class Thought98 extends Thought{
private static ArrayList<Thought98> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 849.1531287560935;
private double fd1 = 359.85178527364087;
private Thought fo0 = null;
private Thought fo1 = null;
Thought98 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought98 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought98 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought98 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought98 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought98 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought98 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought98 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought98 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
        Thought lo1 = Thought174.getInstance(fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        lb0 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    double ld2 = 991.7933343783877;
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb3 = true;
    Output.points[8][8] -= fd1;
    double ld4 = 238.88705984833086;

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
    fd0 *= -1;
    Thought lo0 = Thought289.getInstance(ab2, ab3, ab4, fb0);
    Thought lo1 = Thought208.getInstance(fo0, fo1, fo0, fo1);
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    Output.points[0][0] -= fd1;
    boolean lb3 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb2);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb3, ab1, ab2, ab3);
}
    double ld4 = 297.96597593589564;
    ab4 = fd0 > fd1;
if(fo0 != null){
      fo0.m1();
}
    Output.points[0][1] += ld4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0, fb0, fb1, lb2, lb3);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fd1 = fo1.m3(ab4, fb0, fb1, lb2);
}
    Thought lo5 = Thought374.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(ld4, fd0, fd1, ld4);
}
    lb3 = !ab1;
    ab2 = fd0 > fd1;

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
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        Thought lo0 = Thought149.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
        ad3 = ad4 - fd0;
        fb0 = fd1 < ad1;
        ad2 = ad3 - ad4;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fb0 = fo0.m2();
}
        boolean lb1 = true;
        Thought lo2 = Thought323.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb1, fb0);
        fb1 = lb1 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb1, fb0, fb1);
}
        lb1 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Thought lo3 = Thought279.getInstance(ad3, ad4, fd0, fd1);
        lb1 = fb0 && fb1;
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
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    ab1 = ad1 < ad2;
    boolean lb0 = false;
    ab1 = ab2 || ab3;
    ad3 = ad4 + fd0;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2();
}
    boolean lb1 = true;
    lb1 = ad2 < ad3;
    ab1 = ab2 || ab3;
    Thought lo2 = Thought31.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
    ad2 = ad3 + ad4;
    Output.points[0][2] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb1, ab1, ab2, ab3);
}
    double ld3 = 734.3138909254689;
    boolean lb4 = false;
    Thought lo5 = Thought190.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, ld3, ad1);
}
    ab4 = fb0 || fb1;
    if (lb0) {
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        lb1 = ld3 > ad1;
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
        fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2();
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought363.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    double ld1 = 982.196646557857;
    fb0 = ld1 > fd0;
    double ld2 = 535.8737320379332;
    if (fb1) {
if(ao1 != null){
          ao1.m2(fd0, fd1, ld1, ld2);
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
    double ld0 = 566.2615240869037;
    fb0 = ld0 < ad1;
    Thought lo1 = Thought296.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, ad1, ad2, fb0, fb1, lb2, fb0);
}
    ad3 *= -1;
    double ld3 = 316.29752186024433;
    Thought lo4 = Thought131.getInstance(ao2, ao3, ao4, fo0, fb1, lb2, fb0, fb1);
    lb2 = fb0 || fb1;
    lb2 = fb0 || fb1;
    double ld5 = 295.648874489872;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad2 *= -1;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 && lb2;
if(ao1 != null){
      ld3 = ao1.m3(fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;
    ld5 = ad1 - ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb6 = true;
if(ao2 != null){
      ao2.m1(ad3, ad4, fd0, fd1);
}
    ld0 *= -1;
    fb0 = ld3 < ld5;

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
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 *= -1;
    double ld0 = 453.453017500247;
    Thought lo1 = Thought110.getInstance(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
    double ld2 = 6.174677534695903;
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, ab1, ab2);
}
    boolean lb3 = true;
    Output.points[0][3] -= ld2;
    Thought lo4 = Thought314.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ao4.m3(fd0, fd1, ld0, ld2);
}
    double ld5 = 573.4470515247947;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld5, fd0, fd1, ld0);
}
if(fo0 != null){
      ld2 = fo0.m3(ld5, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = lb3 || ab1;
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
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
      ao1 = ao2.m4();
}
    ab1 = ab2 && ab3;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao2.m2(ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
    fb1 = ab1 && ab2;
    Thought lo0 = Thought89.getInstance(ao3, ao4, fo0, fo1);
    Thought lo1 = Thought265.getInstance(ad4, fd0, fd1, ad1);
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    Output.points[0][4] += fd1;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
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
    fb1 = fd0 > fd1;
    Thought lo0 = Thought267.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;
    Output.points[0][5] -= fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    Output.points[0][6] += fd0;
    fd1 = fd0 - fd1;
        fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;

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
    Thought lo0 = Thought162.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    ab2 = !ab3;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    Thought lo1 = Thought314.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    Thought lo2 = Thought155.getInstance(ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought149.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb4, ab1);
}
    Thought lo5 = Thought172.getInstance();
    double ld6 = 822.450070095054;
    ab2 = ld6 > fd0;
        Output.points[0][7] -= fd1;
    double ld7 = 846.0024628942854;
    ld6 = ld7 - fd0;
    double ld8 = 523.5767873550442;
        ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld6, ld7, fb1, lb4, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb1) {
        double ld0 = 64.70457595473836;
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        boolean lb1 = false;
        ad1 = ad2 + ad3;
        ad4 = fd0 - fd1;
if(fo1 != null){
          fo1.m2(ld0, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
        lb1 = ld0 > ad1;
        Thought lo2 = Thought54.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
        fd1 = ld0 + ad1;
        double ld3 = 586.7731125927319;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    ab3 = fd1 > ad1;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 - fd1;
    double ld0 = 742.4125948103632;
    boolean lb1 = true;
    Output.points[0][8] += ld0;
        boolean lb2 = false;
    double ld3 = 89.43689528795869;
if(fo1 != null){
      fo0 = fo1.m4(ld3, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
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
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
    double ld0 = 115.67325749351282;
    Thought lo1 = Thought346.getInstance();
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m2(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    boolean lb2 = true;
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(lb2, fb0, fb1, lb2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
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
        fb0 = !fb1;
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && fb0;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao2.m2(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    double ld0 = 370.35246212791105;
    ad2 *= -1;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    boolean lb1 = false;
if(ao3 != null){
      fb0 = ao3.m2(fb1, lb1, fb0, fb1);
}
    ld0 = ad1 - ad2;

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
    Thought lo1 = Thought213.getInstance(ao2, ao3, ao4, fo0);
    double ld2 = 276.33771817922946;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld2, fd0);
}
    Output.points[1][0] -= fd1;
    boolean lb3 = true;
    double ld4 = 859.1825761252667;
    ld2 *= -1;
    Output.points[1][1] += ld4;
    Thought lo5 = Thought195.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld2, ld4);
    boolean lb6 = true;
        Thought lo7 = Thought322.getInstance(fd0, fd1, ld2, ld4, lb3, lb6, ab1, ab2);
    ab3 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
    ld2 = ld4 + fd0;
    Output.points[1][2] -= fd1;
    ld2 = ld4 + fd0;
    lb3 = lb6 && ab1;
    ab2 = fd1 < ld2;
    ab3 = !ab4;
if(ao1 != null){
      fo1 = ao1.m4();
}
        ld4 = fd0 - fd1;

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
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    double ld0 = 92.16433707397447;
    fb1 = !ab1;
if(ao3 != null){
          ab2 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld0);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    ab3 = ab4 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, ad1, ad2, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought254.getInstance(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
if(ao3 != null){
      ao3.m2();
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
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
        fd0 *= -1;
        fb0 = fd1 < fd0;
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought182.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
        fb1 = fd0 < fd1;
        fb0 = fd0 > fd1;
if(fo0 != null){
          fo0.m1();
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
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
    ab1 = ab2 && ab3;
    fd0 *= -1;
    Thought lo0 = Thought198.getInstance(ab4, fb0, fb1, ab1);
    ab2 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld1 = 966.423349005771;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo0.m1(fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld1 *= -1;
    ab1 = ab2 && ab3;
    fd0 = fd1 + ld1;
    ab4 = fb0 && fb1;
        fd0 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought361.getInstance();
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ld1 = fo1.m3(ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ld1 = fd0 - fd1;
    Thought lo3 = Thought108.getInstance(ld1, fd0, fd1, ld1);
    double ld4 = 488.8562903463345;
if(fo1 != null){
      ld4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld4);
}
    fd0 = fd1 + ld1;
if(fo0 != null){
      fo0.m2(ld4, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    boolean lb0 = false;
    lb0 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    ad3 *= -1;
if(fo1 != null){
              fb1 = fo1.m2();
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought343.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 < ad1;
    Thought lo2 = Thought381.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    lb0 = fd1 < ad1;
    Thought lo3 = Thought12.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = !fb0;
    boolean lb4 = false;
    fb0 = ad3 > ad4;

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
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
    ab2 = ad2 > ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    double ld0 = 175.6683927798746;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    boolean lb1 = false;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ld0);
}
    boolean lb2 = false;
    lb1 = ad1 < ad2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(ld0, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
}
    Thought lo3 = Thought364.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
    lb2 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    if (ab1) {
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fd0 = ao1.m3(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Output.points[1][3] -= fd0;
        Output.points[1][4] -= fd1;
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
    fb1 = !fb0;

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
if(ao2 != null){
      fb1 = ao2.m2();
}
    Output.points[1][5] -= ad1;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    boolean lb0 = false;
    boolean lb1 = true;
    lb0 = lb1 && fb0;
    boolean lb2 = true;
if(ao3 != null){
      fb0 = ao3.m2(fb1, lb0, lb1, lb2);
}
    boolean lb3 = false;
    lb3 = ad4 > fd0;

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
    ab1 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        double ld0 = 29.227004698402926;
        }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ab2 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    if (ab3) {
        Thought lo1 = Thought33.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
        fd0 = fd1 + fd0;
        boolean lb2 = false;
        double ld3 = 884.155357444315;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld3, fd0, ab3, ab4, fb0, fb1);
}
        lb2 = fd1 > ld3;
        fd0 = fd1 - ld3;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    Output.points[1][6] += ad1;
    Output.points[1][7] -= ad2;
if(ao2 != null){
      ao2.m3();
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
    ad1 = ad2 - ad3;
    Thought lo0 = Thought155.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;
    ab1 = ab2 && ab3;
    boolean lb2 = true;
    Thought lo3 = Thought229.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
    boolean lb4 = true;
    Output.points[1][8] += ad1;
    Output.points[2][0] -= ad2;
    ab2 = !ab3;
    Thought lo5 = Thought399.getInstance(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb2, lb4, ab1, ab2);
}
if(ao1 != null){
      ao1.m1();
}
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb1);
}
        Thought lo6 = Thought79.getInstance(lb2, lb4, ab1, ab2);
        Output.points[2][1] += fd0;
    boolean lb7 = true;

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
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 24.745560951469137;
    fb0 = !fb1;
    double ld1 = 289.14720378732795;
if(fo0 != null){
          ld1 = fo0.m3(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought13.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    double ld3 = 150.0024621879176;
    boolean lb4 = false;
    if (lb4) {
if(fo1 != null){
          ld3 = fo1.m3();
}
        fb0 = fd0 > fd1;
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ld3, fd0, fd1, fb1, lb4, fb0, fb1);
}
if(fo1 != null){
          fo1.m1(lb4, fb0, fb1, lb4);
}
        boolean lb5 = false;
        lb4 = fb0 && fb1;
        lb5 = ld0 > ld1;
        double ld6 = 42.19364969333644;
        Output.points[2][2] -= ld1;
        boolean lb7 = true;
        ld3 *= -1;
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    Thought lo0 = Thought36.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m1(fb0, fb1, ab1, ab2);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld0 = 732.4776886011251;
    ad1 *= -1;
    fb1 = fb0 || fb1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, ad1);
}
    fb0 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    if (fb1) {
        fb0 = ad1 < ad2;
        double ld1 = 32.28512110900311;
        fb1 = fb0 || fb1;
        boolean lb2 = true;
        lb2 = fb0 && fb1;
        lb2 = ad2 < ad3;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
}
        boolean lb3 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb3);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb2, lb3);
}
        double ld4 = 228.0209106163403;
        Thought lo5 = Thought362.getInstance(fb0, fb1, lb2, lb3);
        boolean lb6 = false;
        boolean lb7 = true;
        Thought lo8 = Thought318.getInstance(fo1, fo0, fo1, fo0);
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
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    boolean lb0 = true;
    ad4 = fd0 - fd1;
    boolean lb1 = false;
    boolean lb2 = false;
    Output.points[2][3] += ad1;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, lb2, lb3);
}
    fd1 = ad1 - ad2;
    ad3 *= -1;
    double ld4 = 633.4117838597168;
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        lb5 = !ab1;
    Thought lo6 = Thought375.getInstance(ad3, ad4, fd0, fd1);
    ab2 = ld4 > ad1;
    boolean lb7 = true;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    ad2 *= -1;

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
    fb0 = fd1 < fd0;
    fd1 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    fb0 = fd0 < fd1;
    fd0 *= -1;
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    Thought lo2 = Thought117.getInstance(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb0);
    lb1 = fb0 && fb1;
if(ao1 != null){
      lb0 = ao1.m2();
}
    double ld3 = 839.0241379543869;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld3, fd0, lb1, fb0, fb1, lb0);
}
    double ld4 = 715.5992720078953;
    if (lb1) {
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, lb0, lb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought392.getInstance(ao1, ao2, ao3, ao4);
    ad1 = ad2 - ad3;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    Output.points[2][4] += fd1;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
    fb0 = ad4 > fd0;
    fb1 = lb1 || fb0;
if(fo1 != null){
      fo1.m2(fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
    if (lb1) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ao1.m1(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
        for(int i0=0; i0<10; i0++){
            Thought lo2 = Thought68.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
            fd1 = ad1 - ad2;
}}
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
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 + fd0;
    fb0 = fb1 && ab1;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    boolean lb0 = true;
    lb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb0 = fb1 || lb0;
    ab1 = ab2 && ab3;

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
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ab1 = !ab2;
    Output.points[2][5] -= ad1;
    ab3 = ad2 < ad3;
    ab4 = !fb0;
    fb1 = ad4 < fd0;
    ab1 = fd1 < ad1;
        ab2 = ab3 || ab4;
if(ao1 != null){
      fb0 = ao1.m2(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 > ad1;
    ab3 = !ab4;
    fb0 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = ad4 > fd0;
    ab1 = ab2 || ab3;
    Output.points[2][6] += fd1;
    ab4 = ad1 < ad2;
    ad3 *= -1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought71.getInstance(fo0, fo1, ao1, ao2);
    ad2 = ad3 - ad4;
    boolean lb2 = false;

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
    Thought lo0 = Thought146.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fd0 < fd1;
    Output.points[2][7] += fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo0 != null){
          fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld1 = 439.13459857566886;
    fd0 = fd1 - ld1;
    Thought lo2 = Thought250.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2();
}
    fb0 = fb1 && fb0;
    double ld3 = 18.583738653189695;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    Output.points[2][8] -= ld3;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ld3, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld1, ld3, fd0);
}
    fb0 = fd1 < ld1;
    ld3 = fd0 - fd1;
if(fo0 != null){
      fb1 = fo0.m2(ld1, ld3, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
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
    Thought lo0 = Thought140.getInstance();
    fd0 = fd1 + fd0;
    Output.points[3][0] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    double ld1 = 715.9720770813634;
    Output.points[3][1] += fd0;
    fd1 = ld1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = ld1 - fd0;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = fd1 < ld1;
        fd0 = fd1 + ld1;
    fb0 = fd0 < fd1;
    boolean lb2 = true;

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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    Output.points[3][2] += fd1;
    double ld0 = 571.1455710845308;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld1 = 263.94432909508294;
    double ld2 = 416.62444093778873;
    fb1 = !fb0;
    boolean lb3 = true;
    fb0 = ld1 > ld2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1);
}
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld0);
}
    fb0 = fb1 && lb3;
    Output.points[3][3] += ld1;
    lb4 = !fb0;
        Thought lo5 = Thought289.getInstance(ld2, fd0, fd1, ld0, fb1, lb3, lb4, fb0);
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb3, lb4, fb0);
}
    double ld6 = 689.3944099485752;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = ld2 < ld6;
    lb3 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, ld2, ld6, lb4, fb0, fb1, lb3);
}
    Thought lo7 = Thought9.getInstance(lb4, fb0, fb1, lb3);

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
