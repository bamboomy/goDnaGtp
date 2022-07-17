package genetic;
import java.util.ArrayList;
class Thought77 extends Thought{
private static ArrayList<Thought77> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 829.9489203344801;
private double fd1 = 901.9277066721336;
private Thought fo0 = null;
private Thought fo1 = null;
Thought77 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought77 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought77 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought77 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought77 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought77 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought77 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought77 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought77 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought77 instance = new Thought77 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought77 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought77 instance = new Thought77 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought77 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought77 instance = new Thought77 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought77 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought77 instance = new Thought77 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought77 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought77 instance = new Thought77 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought77 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought77 instance = new Thought77 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought77 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought77 instance = new Thought77 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought77 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought77 instance = new Thought77 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought226.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 539.6962270413209;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
}
    fb0 = ld1 < fd0;

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
    Output.points[8][8] += fd0;
    Output.points[0][0] += fd1;
    double ld0 = 21.467482766897152;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    double ld1 = 214.26058665683902;
    fb0 = !fb1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ld1 *= -1;
    fd0 = fd1 - ld0;
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
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    double ld0 = 974.8945402161916;
    fb0 = fb1 && fb0;
    double ld1 = 304.5300468094041;
    ad1 = ad2 + ad3;
    ad4 *= -1;
        fb1 = fd0 < fd1;
    ld0 = ld1 - ad1;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    ab1 = fd1 > ad1;
    double ld0 = 273.5721752415609;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb0 = fd1 > ld0;
    fb1 = !lb1;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    ad1 = ad2 - ad3;
    lb1 = ad4 < fd0;
    boolean lb2 = false;
    lb2 = fd1 < ld0;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought226.getInstance(fb1, lb1, lb2, ab1);
    double ld4 = 100.37788704620732;

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
    Output.points[0][1] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = !fb0;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao3.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fd1 = ao4.m3();
}
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
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
    double ld0 = 676.5722593050998;
if(ao2 != null){
      ld0 = ao2.m3(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought233.getInstance(ao3, ao4, fo0, fo1);
    fb0 = ad1 > ad2;
    double ld2 = 304.5833728246666;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ld2, ad1, ad2, ad3);
}
    Output.points[0][2] += ad4;
    Thought lo3 = Thought351.getInstance(fd0, fd1, ld0, ld2, fb1, fb0, fb1, fb0);
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
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
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao3.m1(ab2, ab3, ab4, fb0);
}
    double ld0 = 732.4851982923335;
    fb1 = fd0 < fd1;
    ld0 = fd0 + fd1;
    ab1 = ab2 && ab3;
    ld0 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb1 = false;
    ab3 = ab4 && fb0;
    ld0 = fd0 + fd1;
    fb1 = lb1 || ab1;
if(ao4 != null){
      ab2 = ao4.m2(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0);
}
    ab3 = ab4 || fb0;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, ab4, fb0, fb1, lb1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ad2 > ad3;
    ad4 = fd0 - fd1;
    ab1 = ab2 && ab3;
    boolean lb0 = true;
    ad1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(lb0, ab1, ab2, ab3);
}
    fd1 = ad1 + ad2;
    Thought lo1 = Thought397.getInstance(ao4, fo0, fo1, ao1);
    ab4 = fb0 || fb1;
    lb0 = ab1 && ab2;
    double ld2 = 978.1416907013065;
if(ao2 != null){
      ab3 = ao2.m2(ad2, ad3, ad4, fd0);
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
    fb0 = fd1 > fd0;
    double ld0 = 426.8353862714998;
    double ld1 = 196.42216201413822;
    ld1 = fd0 - fd1;
    boolean lb2 = false;
    fb0 = ld0 < ld1;
    Output.points[0][3] -= fd0;
    fd1 *= -1;
    fb1 = lb2 || fb0;
    fb1 = lb2 || fb0;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
}
    boolean lb3 = false;
    fb0 = fb1 && lb2;
    ld1 = fd0 + fd1;
    boolean lb4 = false;
    Output.points[0][4] -= ld0;
    lb3 = ld1 < fd0;
    Thought lo5 = Thought381.getInstance(fd1, ld0, ld1, fd0, lb4, fb0, fb1, lb2);
    lb3 = lb4 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb2, lb3, lb4);
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
    fd1 = fd0 + fd1;
    ab1 = !ab2;
    double ld0 = 889.3438471775376;
if(fo1 != null){
      ab3 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    double ld1 = 747.1761952481029;
    boolean lb2 = false;
    ld1 *= -1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ld0 > ld1;
    double ld3 = 53.27164942997125;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld0);
}
    ld1 = ld3 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ld1, ld3, fd0);
}
    double ld4 = 339.24845971024536;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld0, ld1, ld3, lb2, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    lb2 = ab1 || ab2;
    ab3 = ld4 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb2);
}
    Thought lo5 = Thought195.getInstance();

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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
        fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
    boolean lb1 = false;
    double ld2 = 302.2329159892317;
if(fo1 != null){
      fo1.m3(lb1, fb0, fb1, lb0);
}
    Output.points[0][5] += ad4;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    lb1 = lb3 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, ad1);
}
    fb1 = ad2 < ad3;
    boolean lb4 = true;
        lb0 = !lb1;
    Output.points[0][6] += ad4;
    fd0 *= -1;
    lb3 = lb4 && fb0;
    fb1 = fd1 < ld2;
    lb0 = ad1 < ad2;
    if (lb1) {
        lb3 = ad3 < ad4;
        double ld5 = 438.13126757108625;
        lb4 = !fb0;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld5);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought178.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
    ab1 = fd1 < ad1;
if(fo0 != null){
      ad2 = fo0.m3();
}
    Thought lo2 = Thought277.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    Thought lo3 = Thought24.getInstance(fb1, lb0, ab1, ab2);
    ad1 = ad2 - ad3;
    boolean lb4 = false;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb5 = true;
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    boolean lb6 = true;
    ab1 = ab2 || ab3;
    Thought lo7 = Thought168.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
    Thought lo8 = Thought321.getInstance(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
    Thought lo9 = Thought83.getInstance(fo0, fo1, fo0, fo1, lb4, lb5, lb6, ab1);
    boolean lb10 = false;
    double ld11 = 839.7094032890697;
if(fo0 != null){
      ab1 = fo0.m2();
}
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld11, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    boolean lb12 = false;
    lb4 = ad4 > fd0;
        fd1 = ld11 - ad1;
    if (lb5) {
}
Thought.STACK_COUNTER++;
return lb6;
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
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    double ld0 = 703.2389298658368;
    fb1 = fb0 && fb1;
    ld0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m3(fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
}
    Output.points[0][7] += fd1;
    ld0 *= -1;
    boolean lb1 = false;
    fd0 = fd1 + ld0;
    lb1 = !fb0;
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
          lb1 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
    lb1 = fd0 < fd1;
    fb0 = ld0 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb1, fb0, fb1);
}
    boolean lb2 = false;
    lb1 = ld0 < fd0;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
        fb0 = !fb1;
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
        Thought lo1 = Thought115.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
if(ao3 != null){
          ao2 = ao3.m4();
}
        fb1 = ad1 > ad2;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
        double ld2 = 519.9847385628287;
        boolean lb3 = true;
        Thought lo4 = Thought334.getInstance(lb0, fb0, fb1, lb3);
        lb0 = ld2 < ad1;
        Output.points[0][8] -= ad2;
        fb0 = !fb1;
        lb3 = ad3 > ad4;
        Output.points[1][0] -= fd0;
        lb0 = fb0 || fb1;
        lb3 = lb0 && fb0;
        boolean lb5 = true;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    ab2 = !ab3;
    Thought lo0 = Thought210.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab4 = fb0 || fb1;
    fd0 *= -1;
    Thought lo1 = Thought60.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fd1 = fd0 - fd1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    ab4 = fb0 || fb1;
    ab1 = !ab2;
    double ld2 = 522.5277727133304;
    Output.points[1][1] += fd0;
    Output.points[1][2] -= fd1;
    ab3 = ab4 || fb0;
    boolean lb3 = false;
    Thought lo4 = Thought299.getInstance(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld2, fb0, fb1, lb3, ab1);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    double ld0 = 31.07925195792256;
    ab2 = ab3 || ab4;
    boolean lb1 = false;
    Thought lo2 = Thought65.getInstance(ab4, fb0, fb1, lb1);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    ad2 *= -1;
    ad3 *= -1;
    Output.points[1][3] -= ad4;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ad1, ad2);
}
    boolean lb3 = true;
    Output.points[1][4] -= ad3;
    Output.points[1][5] += ad4;
    fd0 *= -1;
    Thought lo4 = Thought363.getInstance(ao1, ao2, ao3, ao4, fd1, ld0, ad1, ad2);
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo5 = Thought37.getInstance(ao1, ao2, ao3, ao4, lb1, lb3, ab1, ab2);
    ab3 = !ab4;
    boolean lb6 = true;
    Thought lo7 = Thought213.getInstance();
    Thought lo8 = Thought130.getInstance(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
    lb3 = ad4 < fd0;
    Thought lo9 = Thought251.getInstance(lb6, ab1, ab2, ab3);
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    double ld10 = 116.1460233801121;
    boolean lb11 = true;
    fd0 = fd1 - ld0;

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
    fb1 = fb0 || fb1;
    Thought lo0 = Thought155.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    lb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought25.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
    fb1 = !lb1;
    Thought lo3 = Thought154.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
    boolean lb4 = true;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb5 = false;

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
        ab2 = ab3 || ab4;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ab4 = fd1 > fd0;
    Thought lo0 = Thought65.getInstance();
        fd1 *= -1;

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
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    ad1 *= -1;
    fb0 = ad2 > ad3;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    boolean lb1 = false;
    Output.points[1][6] -= ad4;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, lb2, fb0);
}
    fb1 = !lb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
    fb1 = !ab1;
    ab2 = fd1 > ad1;
    if (ab3) {
        ad2 *= -1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        Output.points[1][7] -= ad1;
        ab4 = ad2 > ad3;
if(fo0 != null){
          ad4 = fo0.m3(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 || fb0;
        fb1 = ab1 && ab2;
        ab3 = ab4 && fb0;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    fd1 = fd0 + fd1;
    fb0 = fb1 || lb0;
if(ao2 != null){
      ao2.m1();
}
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    Output.points[1][8] -= fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Output.points[2][0] -= fd0;
    fb1 = fd1 < fd0;
        lb0 = fb0 || fb1;
    lb0 = fd1 < fd0;
    Thought lo1 = Thought4.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    Thought lo2 = Thought187.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    Thought lo3 = Thought289.getInstance(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);

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
    ad2 = ad3 + ad4;
    boolean lb0 = true;
if(ao2 != null){
      ao2.m3();
}
    fb0 = fd0 < fd1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = ad1 + ad2;
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2);
}
    Thought lo1 = Thought135.getInstance(ad4, fd0, fd1, ad1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fb1 = lb0 && fb0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought231.getInstance();
    fb0 = fb1 || ab1;
    ab2 = fd0 < fd1;
    ab3 = !ab4;
    double ld1 = 221.99392041527577;
    Thought lo2 = Thought138.getInstance(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld1, fb0, fb1, ab1, ab2);
if(ao4 != null){
      fd0 = ao4.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ld1, fd0, fd1, ld1);
}
    boolean lb3 = false;
    lb3 = ab1 && ab2;
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb3);
}
        ab1 = ld1 > fd0;
    ab2 = ab3 && ab4;
    Thought lo4 = Thought210.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb3, ab1);
    fd1 *= -1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m1();
}
    fb0 = fb1 || lb3;
    ld1 = fd0 + fd1;

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
    ab2 = ad2 > ad3;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 || ab3;
        ad2 = ad3 + ad4;
        double ld0 = 757.2802711302925;
if(ao1 != null){
          ao1.m2(ab4, fb0, fb1, ab1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ab2 = ab3 && ab4;
        fb0 = fb1 && ab1;
        boolean lb1 = false;
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
    fb0 = fd1 > fd0;
    Output.points[2][1] -= fd1;
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought129.getInstance();
    double ld3 = 338.0567714059996;
    fb0 = ld3 > fd0;
    Thought lo4 = Thought48.getInstance(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1, fb1, lb0, lb1, fb0);
    Thought lo5 = Thought117.getInstance(fb1, lb0, lb1, fb0);
    fb1 = lb0 || lb1;
    fb0 = ld3 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 < ld3;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld3, fd0);
}
    lb0 = fd1 < ld3;
    fd0 = fd1 + ld3;
    boolean lb6 = true;
        lb1 = !lb6;
    fd0 = fd1 - ld3;
    double ld7 = 466.63864990713637;
    if (fb0) {
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
    ab2 = !ab3;
    ab4 = fd1 > fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
        fd1 *= -1;
        ab3 = !ab4;
        double ld0 = 934.828539997704;
        fb0 = ld0 < fd0;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
        ab4 = fd1 > ld0;
        fd0 = fd1 - ld0;
        boolean lb1 = false;
        boolean lb2 = true;
        boolean lb3 = true;
if(fo1 != null){
          fd0 = fo1.m3();
}
        Thought lo4 = Thought17.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo0 != null){
          ld0 = fo0.m3(fb1, lb1, lb2, lb3);
}
        ab1 = !ab2;
        fd0 = fd1 - ld0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
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
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    if (fb1) {
        Output.points[2][2] -= fd1;
        fb0 = ad1 < ad2;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        fb1 = ad1 < ad2;
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
            ad1 = ad2 + ad3;
            boolean lb0 = false;
            ad4 = fd0 + fd1;
            lb0 = fb0 || fb1;
            }
        ad1 = ad2 - ad3;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    Thought lo0 = Thought182.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    double ld1 = 662.0950707486035;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    boolean lb2 = false;
    ab2 = ab3 || ab4;
    boolean lb3 = true;
    boolean lb4 = false;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab3 = !ab4;
    boolean lb5 = false;

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
    fd1 *= -1;
    Output.points[2][3] += fd0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought380.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = !fb1;
    fd0 *= -1;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
    boolean lb2 = true;
    Thought lo3 = Thought25.getInstance();
    double ld4 = 109.26795263054284;
    fb0 = ld4 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld4, fd0, fd1, fb1, lb1, lb2, fb0);
}
    boolean lb5 = true;

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
    if (fb1) {
        ad1 *= -1;
        fb0 = fb1 || fb0;
        boolean lb0 = true;
        Output.points[2][4] -= ad2;
        boolean lb1 = false;
        lb1 = !fb0;
        ad3 *= -1;
        ad4 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(fb1, lb0, lb1, fb0);
}
        Output.points[2][5] -= fd0;
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
        Output.points[2][6] += fd1;
if(ao3 != null){
          ad1 = ao3.m3(ad2, ad3, ad4, fd0);
}
        lb0 = !lb1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
          ao4.m1(ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
        Output.points[2][7] -= ad2;
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb2, fb0, fb1, lb0);
}
        ad3 *= -1;
        ad4 *= -1;
        lb1 = lb2 || fb0;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb1, lb0, lb1, lb2);
}
if(ao1 != null){
          ad3 = ao1.m3(fb0, fb1, lb0, lb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought162.getInstance(ao1, ao2, ao3, ao4);
    fd1 = fd0 + fd1;
    ab1 = ab2 || ab3;
        ab4 = fd0 < fd1;
    double ld1 = 670.3412756738593;
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0);
}
    Output.points[2][8] += fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1);
}
    fd0 *= -1;
    fd1 *= -1;
    ld1 = fd0 - fd1;
    fb0 = !fb1;
    ld1 = fd0 - fd1;
    Thought lo2 = Thought62.getInstance(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
    fd0 = fd1 - ld1;
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb3);
}
    ab1 = !ab2;
    double ld4 = 894.9340390913935;
if(fo1 != null){
      fo1.m2();
}
    ab3 = ab4 || fb0;
    fb1 = ld4 > fd0;

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
    boolean lb0 = true;
    Thought lo1 = Thought66.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
if(fo1 != null){
      fd1 = fo1.m3(ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
        fb0 = fb1 || lb0;
        ab1 = ab2 && ab3;
        ab4 = fb0 || fb1;
        ad4 = fd0 + fd1;
        ad1 = ad2 + ad3;
        boolean lb2 = false;
if(ao1 != null){
          fo1 = ao1.m4(ad4, fd0, fd1, ad1);
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
    boolean lb0 = false;
    boolean lb1 = true;
        lb0 = fd1 < fd0;
    Thought lo2 = Thought166.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    lb1 = fd1 > fd0;
    Thought lo3 = Thought367.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
    boolean lb4 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb0);
}
    lb1 = fd1 < fd0;
    boolean lb5 = false;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    Output.points[3][0] += fd1;
    Output.points[3][1] -= fd0;
    Thought lo6 = Thought143.getInstance();
        Output.points[3][2] += fd1;
    boolean lb7 = true;
    lb4 = lb5 || lb7;
        Thought lo8 = Thought168.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(lb4, lb5, lb7, fb0);
}
    fb1 = fd0 < fd1;
    Output.points[3][3] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb0 = lb1 && lb4;

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
    fd0 = fd1 - fd0;
    Output.points[3][4] += fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    double ld0 = 719.0768349498197;
    Thought lo1 = Thought365.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
    fd0 = fd1 + ld0;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
        fd1 *= -1;
    ld0 = fd0 + fd1;

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
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Output.points[3][5] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 312.95227150684667;

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
