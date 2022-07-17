package genetic;
import java.util.ArrayList;
class Thought86 extends Thought{
private static ArrayList<Thought86> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 120.32238478326462;
private double fd1 = 633.2194330722865;
private Thought fo0 = null;
private Thought fo1 = null;
Thought86 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought86 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought86 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought86 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought86 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought86 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought86 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought86 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought86 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 && fb0;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    lb0 = lb1 && fb0;
    fd0 *= -1;
    fb1 = fd1 < fd0;
    fd1 *= -1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    lb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought261.getInstance(fb1, ab1, ab2, ab3);
    ab4 = !fb0;
    fb1 = ab1 || ab2;
    double ld1 = 483.0246808689808;
    fd0 = fd1 - ld1;
    Output.points[6][6] += fd0;
    boolean lb2 = true;
    boolean lb3 = false;
    fd1 *= -1;
        boolean lb4 = true;
    Thought lo5 = Thought185.getInstance(fo1, fo0, fo1, fo0);
    Thought lo6 = Thought145.getInstance(ld1, fd0, fd1, ld1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, lb4, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb2);
}
    fd0 = fd1 - ld1;
    boolean lb7 = false;
    lb3 = fd0 > fd1;
if(fo1 != null){
      ld1 = fo1.m3();
}
    Output.points[6][7] += fd0;
    fd1 = ld1 - fd0;
    double ld8 = 910.2986299972579;
    boolean lb9 = true;
    lb4 = lb7 || lb9;

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
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd1 *= -1;
    fb0 = !fb1;
    ad1 = ad2 + ad3;
    boolean lb1 = true;
    Thought lo2 = Thought181.getInstance(fo0, fo1, fo0, fo1);
    lb0 = lb1 || fb0;
    double ld3 = 467.01794386927213;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    fb1 = lb0 || lb1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ld3 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        fd0 = fd1 + ld3;
        Thought lo4 = Thought32.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
        Output.points[6][8] += fd0;
        fb0 = fd1 > ld3;
        Thought lo5 = Thought316.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
if(fo0 != null){
          fo1 = fo0.m4();
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
    ab4 = ad3 > ad4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    double ld0 = 398.08723148832075;
    ad3 *= -1;
    fb0 = ad4 < fd0;
    Thought lo1 = Thought397.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    double ld2 = 739.8687153551301;
    ab4 = ld2 < ad1;
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo1.m1();
}
        }
    Output.points[7][0] -= fd0;
    ab3 = fd1 < ld0;
    ab4 = ld2 > ad1;
    ad2 = ad3 + ad4;
    Output.points[7][1] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ad1, fb0, fb1, ab1, ab2);
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
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    boolean lb0 = false;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    lb0 = lb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, lb1, fb0);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb1 = !lb0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought168.getInstance(fd1, fd0, fd1, fd0);
    lb1 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    double ld3 = 379.8801227305097;

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
    Thought lo0 = Thought214.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
        fb0 = ad1 > ad2;
    fb1 = fb0 || fb1;
    fb0 = ad3 > ad4;
    double ld1 = 519.8644914308313;
if(ao1 != null){
      ad4 = ao1.m3();
}
    fd0 = fd1 - ld1;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    Thought lo2 = Thought235.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ad1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      ad2 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    ad3 *= -1;
    ad4 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ld1, ad1, ad2, ad3);
}
    fb1 = fb0 || fb1;
    Thought lo3 = Thought376.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld1);
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
        fd1 = ld1 - ad1;

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
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[7][2] -= fd0;
    ab3 = fd1 > fd0;
    ab4 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    ab1 = fd0 < fd1;
    Output.points[7][3] -= fd0;
    double ld0 = 196.78555191716612;
    ab2 = !ab3;
if(ao2 != null){
      ao2.m3(ab4, fb0, fb1, ab1);
}
    Output.points[7][4] -= fd0;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1);
}
    boolean lb1 = true;
    ab2 = fd1 > ld0;
if(ao2 != null){
      ao2.m1(fd0, fd1, ld0, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
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
    boolean lb0 = true;
    double ld1 = 465.38421738691966;
    ad3 = ad4 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
        for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
        lb2 = ab1 && ab2;
        Output.points[7][5] += ad3;
        Thought lo3 = Thought183.getInstance();
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
        Thought lo4 = Thought188.getInstance(lb0, lb2, ab1, ab2);
        ad1 = ad2 + ad3;
        double ld5 = 387.2514651521296;
        double ld6 = 809.4932636457679;
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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld0 = 242.1561013909582;
if(fo1 != null){
      fb1 = fo1.m2(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd0 < fd1;
    boolean lb1 = true;
    fb0 = ld0 > fd0;
    boolean lb2 = true;
    fd1 = ld0 - fd0;

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
    ab2 = fd0 > fd1;
    boolean lb0 = true;
    Thought lo1 = Thought343.getInstance();
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, lb2, ab1);
}
    double ld3 = 427.94686575219936;
    ld3 = fd0 + fd1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab3 = fo1.m2(ld3, fd0, fd1, ld3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld3, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ld3 = fd0 - fd1;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1();
}
    fb0 = ld3 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1, fb1, lb0, lb2, ab1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought203.getInstance(fb0, fb1, fb0, fb1);
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
    ad1 *= -1;
    lb1 = lb2 && fb0;
    boolean lb3 = false;
    boolean lb4 = true;
    lb4 = fb0 && fb1;
if(fo0 != null){
      lb1 = fo0.m2(ad2, ad3, ad4, fd0);
}
    lb2 = lb3 || lb4;
    fb0 = fd1 < ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;

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
    Thought lo0 = Thought243.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, ab1);
}
        fd0 *= -1;
        ab2 = ab3 || ab4;
        fb0 = fd1 < ad1;
        fb1 = !lb1;
        double ld2 = 175.7574194655496;
        boolean lb3 = false;
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb4 = false;
        ad1 *= -1;
        double ld5 = 493.9420928464072;
if(fo1 != null){
          lb4 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
        Thought lo6 = Thought181.getInstance(ab4, fb0, fb1, lb3);
        lb4 = lb1 || ab1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld2, ld5);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
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
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        fb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        Output.points[7][6] += fd1;
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
        }
        fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
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
    fb0 = ad1 > ad2;
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = ad3 > ad4;
    fb0 = fd0 < fd1;
    Output.points[7][7] += ad1;
    ad2 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
        Output.points[7][8] -= ad1;
    boolean lb0 = true;
    Thought lo1 = Thought85.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      ao3.m2(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
    double ld2 = 826.2278728089817;
    ad1 = ad2 - ad3;
    fb1 = lb0 || fb0;
    fb1 = lb0 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld2);
}
    fb1 = lb0 || fb0;
    fb1 = ad1 > ad2;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4();
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
    fd0 = fd1 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    fb1 = ab1 && ab2;
    fd0 *= -1;
if(ao1 != null){
          ao1.m1(ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    double ld1 = 350.27499669178076;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(ld1, fd0, fd1, ld1);
}
    Thought lo2 = Thought271.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
    Thought lo3 = Thought257.getInstance(fd1, ld1, fd0, fd1, lb0, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
    boolean lb4 = false;
if(fo1 != null){
      ld1 = fo1.m3(ao1, ao2, ao3, ao4, lb0, lb4, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab3 = fd0 > fd1;
    double ld5 = 114.09576614236688;
    boolean lb6 = true;
    ld1 = ld5 + fd0;
    fd1 = ld1 + ld5;
    fd0 *= -1;
    Output.points[8][0] -= fd1;
    Output.points[8][1] -= ld1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ld5, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
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
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ad2 < ad3;
    double ld0 = 405.7701787107086;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        ab1 = ab2 && ab3;
if(ao4 != null){
      ab4 = ao4.m2(ad3, ad4, fd0, fd1);
}
    if (fb0) {
        ld0 *= -1;
if(fo0 != null){
          ad1 = fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
        fb1 = fd1 > ld0;
        ab1 = ab2 || ab3;
        } else {
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought271.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 = fd0 + fd1;
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fb0 && fb1;
    double ld1 = 363.2651243825046;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - ld1;
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    double ld2 = 95.98162361588814;
    ld1 *= -1;
    fb1 = ld2 < fd0;

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
    Thought lo0 = Thought45.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
        boolean lb1 = true;
        ab2 = fd1 > fd0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        }
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab1 = !ab2;
    double ld2 = 797.0680015862267;

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
    boolean lb0 = false;
    lb0 = !fb0;
    Thought lo1 = Thought47.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    fb1 = !lb0;
    double ld2 = 210.20597769471183;
    ad4 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld2, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    double ld3 = 929.0190287361319;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    boolean lb0 = true;
    ab1 = !ab2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    Output.points[8][2] -= ad2;
    lb0 = ad3 > ad4;
    ab1 = !ab2;
    ab3 = fd0 > fd1;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    ab4 = ad1 < ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = ad4 < fd0;
    double ld1 = 689.06116905941;
    fb1 = fd0 < fd1;
    lb0 = ld1 < ad1;
    boolean lb2 = false;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 > fd1;
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought305.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
        Thought lo1 = Thought316.getInstance();
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    double ld3 = 880.3293535638617;
if(ao2 != null){
      ao2.m3(lb2, fb0, fb1, lb2);
}
    ld3 = fd0 - fd1;
    ld3 = fd0 + fd1;
    ld3 = fd0 + fd1;
    fb0 = fb1 || lb2;
    double ld4 = 915.2015284416411;
    ld3 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ld4, fd0, fd1, ld3);
}
    fb0 = fb1 && lb2;

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
    ad1 = ad2 - ad3;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    boolean lb0 = false;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb0);
}
    lb1 = ad1 < ad2;
    boolean lb2 = true;
    lb2 = !fb0;
    ad3 *= -1;
    ad4 *= -1;
    fb1 = lb0 || lb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb0);
}
    lb1 = lb2 || fb0;
if(ao3 != null){
      ao3.m1(fb1, lb0, lb1, lb2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ad3 *= -1;
    Thought lo3 = Thought363.getInstance(ad4, fd0, fd1, ad1);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought382.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought263.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      ab1 = fo0.m2();
}
    ab2 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb2);
}
    Output.points[8][3] += fd1;
    fd0 = fd1 + fd0;
    ab1 = fd1 > fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 < ad3;
    double ld0 = 41.035779199242114;
if(ao1 != null){
      ad3 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb1, ab1);
}
    double ld2 = 64.15608398114176;
    ab2 = ab3 && ab4;
    ad3 *= -1;
    double ld3 = 503.28049786685267;
    ad3 = ad4 - fd0;
    fb0 = fd1 > ld0;
    double ld4 = 681.0923103491713;
    fb1 = ld2 > ld3;
    lb1 = ld4 < ad1;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
        ad2 *= -1;
        ad3 = ad4 + fd0;
        Thought lo5 = Thought1.getInstance(fd1, ld0, ld2, ld3);
        if (ab1) {
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld4, ad1, ad2, ad3);
}
            Thought lo6 = Thought385.getInstance(ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb1, ab1, ab2);
}
if(ao3 != null){
              ao3.m3();
}
            boolean lb7 = false;
}}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    if (fb0) {
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
        fb1 = lb0 || fb0;
        Thought lo1 = Thought106.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
        Thought lo2 = Thought246.getInstance(lb0, fb0, fb1, lb0);
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        fb0 = fb1 && lb0;
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
    fd1 = fd0 + fd1;
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
    fd0 = fd1 + fd0;
    Output.points[8][4] -= fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    ab1 = !ab2;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
    fd0 = fd1 - fd0;
    boolean lb3 = false;
    double ld4 = 377.53620057471943;
    double ld5 = 466.3896391843948;
    ab4 = ld5 > fd0;
    boolean lb6 = false;
    ab4 = fd1 > ld4;
    fb0 = ld5 < fd0;
    Output.points[8][5] += fd1;
    ld4 = ld5 + fd0;
    double ld7 = 370.57544233110644;
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
}
    boolean lb8 = true;
    boolean lb9 = false;
    Thought lo10 = Thought249.getInstance();
    double ld11 = 167.51729744810277;

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
    ad1 *= -1;
    boolean lb0 = false;
    fb0 = ad2 > ad3;
    fb1 = ad4 > fd0;
    boolean lb1 = true;
    lb0 = lb1 && fb0;
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb1, fb0);
}
    fb1 = ad1 > ad2;
    double ld2 = 199.77463469712916;
    ad2 = ad3 - ad4;
        lb0 = lb1 || fb0;
    Output.points[8][6] += fd0;

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
    ad1 = ad2 + ad3;
    ab2 = ab3 || ab4;
    double ld0 = 155.65967750163142;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ld0 = ad1 - ad2;
    Thought lo1 = Thought41.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    Output.points[8][7] -= ld0;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb2);
}
    double ld3 = 972.2523248101702;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb2);
}
    ab1 = ad4 < fd0;
    fd1 = ld0 + ld3;
    Output.points[8][8] += ad1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = ab3 || ab4;
    double ld4 = 173.70838688047243;
    fb0 = !fb1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb2, ab1, ab2, ab3);
}
    Output.points[0][0] += fd1;
if(fo0 != null){
      fo0.m1(ab4, fb0, fb1, lb2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 91.76414558892098;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ld0 = fd0 - fd1;
    fb1 = ld0 < fd0;
    boolean lb1 = false;
        Thought lo2 = Thought125.getInstance(fd1, ld0, fd0, fd1);
    double ld3 = 391.1042697787382;
    lb1 = fb0 && fb1;
    Thought lo4 = Thought60.getInstance(ao1, ao2, ao3, ao4, ld0, ld3, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld3, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
    ld0 = ld3 - fd0;
    fd1 = ld0 + ld3;
    Thought lo5 = Thought333.getInstance();
    fd0 = fd1 - ld0;
    Thought lo6 = Thought305.getInstance(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
if(fo0 != null){
      ao4 = fo0.m4(lb1, fb0, fb1, lb1);
}
    fb0 = ld3 > fd0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
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
    boolean lb0 = true;
    lb0 = ad2 > ad3;
    fb0 = fb1 || lb0;
    fb0 = ad4 < fd0;
if(ao2 != null){
      fb1 = ao2.m2(fd1, ad1, ad2, ad3);
}
    lb0 = !fb0;
    if (fb1) {
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
        ad2 = ad3 + ad4;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
        Thought lo1 = Thought17.getInstance();
        fb1 = !lb0;
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
        fb0 = !fb1;
        lb0 = fb0 && fb1;
        lb0 = ad1 > ad2;
        Thought lo2 = Thought249.getInstance(fb0, fb1, lb0, fb0);
        ad3 = ad4 - fd0;
        double ld3 = 814.3133454274351;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
    boolean lb1 = true;
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(lb0, lb1, lb2, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    double ld3 = 591.0807466152166;
    ab3 = !ab4;
    fd0 = fd1 - ld3;
    fb0 = fd0 > fd1;
    ld3 *= -1;
    boolean lb4 = false;

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
    ad2 *= -1;
    double ld0 = 675.7795607569384;
    Output.points[0][1] -= ad2;
    ad3 *= -1;
    boolean lb1 = true;
    ad4 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1);
}
        Thought lo2 = Thought94.getInstance(ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);
    boolean lb3 = false;
    ab3 = ab4 || fb0;
    boolean lb4 = true;
    fd1 = ld0 - ad1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb1, lb3);
}
    lb4 = ab1 || ab2;
if(fo0 != null){
      ad2 = fo0.m3();
}
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(lb3, lb4, ab1, ab2);
}
        ld0 *= -1;
        ad1 = ad2 + ad3;
        ab3 = !ab4;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        ad4 = fd0 + fd1;
        ld0 *= -1;
        fb0 = fb1 || lb1;
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
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fb0 = fd0 > fd1;
        fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    Output.points[0][2] += fd1;
    fb1 = !fb0;
        fb1 = !fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;

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
    Output.points[0][3] += fd1;
    fb0 = !fb1;
    Thought lo0 = Thought290.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    double ld2 = 457.11333490295385;
if(fo1 != null){
      fo1.m1(lb1, fb0, fb1, lb1);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb3 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld2, fd0);
}
    lb1 = lb3 && fb0;
    fd1 = ld2 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
if(fo1 != null){
      ld2 = fo1.m3(fd0, fd1, ld2, fd0, fb1, lb1, lb3, fb0);
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
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    fb1 = fd0 < fd1;
    double ld1 = 614.6105416244759;
if(fo1 != null){
      lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
        Output.points[0][4] -= ld1;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = !lb0;
    boolean lb2 = true;
    fd0 *= -1;

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
