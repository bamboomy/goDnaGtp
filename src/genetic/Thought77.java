package genetic;
import java.util.ArrayList;
class Thought77 extends Thought{
private static ArrayList<Thought77> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 506.8120179702199;
private double fd1 = 873.7966336927993;
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
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought34.getInstance();
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought74.getInstance(fd0, fd1, fd0, fd1);
    Output.points[8][4] -= fd0;
    fd1 *= -1;
    fb1 = fb0 && fb1;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb2 = lb3 || fb0;
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      lb2 = fo0.m2(lb3, fb0, fb1, lb2);
}
    lb3 = fb0 || fb1;
if(fo1 != null){
      fo1.m1();
}
    boolean lb4 = true;
    lb2 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb3, lb4, fb0, fb1);
}
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    Output.points[8][5] += fd1;
    Output.points[8][6] += fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought47.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1();
}
    boolean lb0 = false;
    Output.points[8][7] += ad1;
    double ld1 = 845.6508576169873;
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + ld1;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ld1;
    boolean lb2 = false;
    Output.points[8][8] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, lb2, fb0, fb1, lb0);
}
    double ld3 = 156.49864797818202;
    Output.points[0][0] += ld3;
    boolean lb4 = false;
    ad1 = ad2 + ad3;
    lb2 = !lb4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
    lb4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ad1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    fb1 = !ab1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 432.2063270065686;
    Output.points[0][1] += fd0;

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
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
        Output.points[0][2] += fd0;
    fb0 = fd1 > fd0;
    fb1 = !lb0;
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    lb1 = fb0 && fb1;
    double ld2 = 557.2163294071212;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 962.8017753424631;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, ad1, ad2);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    ld0 = ad1 - ad2;
    fb0 = ad3 > ad4;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;

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
    fd1 = fd0 - fd1;
    double ld0 = 712.7489178799813;
    ab2 = ld0 < fd0;
    ab3 = fd1 > ld0;
    double ld1 = 305.30234602244735;
    ab4 = !fb0;
    boolean lb2 = true;
    fb0 = fb1 && lb2;
    ld1 = fd0 + fd1;
    ab1 = ab2 || ab3;
    ab4 = ld0 > ld1;
    fb0 = fb1 && lb2;
    fd0 = fd1 + ld0;
    ld1 *= -1;
    fd0 = fd1 + ld0;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    lb2 = ld1 > fd0;
    fd1 = ld0 - ld1;
    Output.points[0][3] -= fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    Thought lo0 = Thought1.getInstance();
if(ao1 != null){
      fd0 = ao1.m3(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = ad4 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        Thought lo2 = Thought37.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
        double ld3 = 687.1526744393107;
        ad4 *= -1;
        fb0 = fd0 > fd1;
        boolean lb4 = false;
        Thought lo5 = Thought82.getInstance(ld3, ad1, ad2, ad3);
        Output.points[0][4] += ad4;
        fb0 = fb1 || lb1;
        lb4 = fd0 > fd1;
if(fo0 != null){
          ld3 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
          ao4.m3(ab1, ab2, ab3, ab4);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld3 = 695.898757871606;
if(fo0 != null){
      fo0.m2(ld3, fd0, fd1, ld3, lb0, lb1, lb2, fb0);
}
    fb1 = lb0 && lb1;
    Thought lo4 = Thought57.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1, lb2, fb0, fb1, lb0);
}
    Output.points[0][5] += ld3;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld3, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1);
}
    lb1 = lb2 && fb0;
if(fo1 != null){
      ld3 = fo1.m3(fb1, lb0, lb1, lb2);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo1 != null){
      fo1.m3(ld3, fd0, fd1, ld3, lb0, lb1, lb2, fb0);
}
    Thought lo5 = Thought80.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1, fb1, lb0, lb1, lb2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab3 = ab4 && fb0;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb0 = fb1 && ab1;
    double ld0 = 564.7065838974582;
    fd0 *= -1;
    ab2 = fd1 < ld0;
    ab3 = !ab4;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld0 = fd0 + fd1;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb1 = ld0 > fd0;
    double ld2 = 451.95513038115934;
    Output.points[0][6] += fd0;
    Thought lo3 = Thought77.getInstance(fd1, ld0, ld2, fd0);
    Thought lo4 = Thought82.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ld2, fd0);
    boolean lb5 = true;
    fd1 = ld0 + ld2;
    lb5 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
        double ld0 = 720.1180329688577;
        ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 - fd1;
    ld0 = ad1 + ad2;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    Output.points[0][7] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    Thought lo2 = Thought65.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);

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
    Thought lo0 = Thought85.getInstance(ab1, ab2, ab3, ab4);
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = false;
if(fo1 != null){
      ab4 = fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb1, ab1);
}
    ad1 = ad2 - ad3;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld3 = 972.5581091101832;
    Thought lo4 = Thought52.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    ld3 = ad1 + ad2;
    boolean lb5 = true;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld3);
}
    lb5 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab3 = fd0 < fd1;
    ld3 *= -1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb1);
}
    ad4 = fd0 - fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][8] += fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao4.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    Thought lo0 = Thought85.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
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
    double ld0 = 595.7531871489616;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld0;
    fb0 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ad3 = ao3.m3();
}
if(ao4 != null){
      fb1 = ao4.m2(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought83.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[1][0] += fd0;
    fb0 = !fb1;
    fb0 = !fb1;
    Thought lo2 = Thought98.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
if(ao1 != null){
      ao1.m2(fd1, ld0, ad1, ad2);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;

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
    double ld0 = 796.1617854678759;
    ab2 = fd0 > fd1;
    boolean lb1 = false;
        ab2 = ab3 || ab4;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(ao1 != null){
      fb1 = ao1.m2(lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought52.getInstance();
    fd0 *= -1;
    Output.points[1][1] += fd1;
if(ao2 != null){
      ab4 = ao2.m2(ld0, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
}
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    Thought lo3 = Thought41.getInstance(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = ld0 < fd0;
    lb1 = fd1 > ld0;

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
    ab1 = ab2 && ab3;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought54.getInstance(ad3, ad4, fd0, fd1);
    ab2 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        fb0 = fd0 < fd1;
    double ld1 = 637.9360871025132;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld1, ad1);
}
    ad2 = ad3 + ad4;
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1);
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
    Output.points[1][2] += fd0;
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    fb1 = !fb0;
    Output.points[1][3] -= fd1;
    for(int i0=0; i0<10; i0++){
        }
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought68.getInstance();
    Thought lo1 = Thought17.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought78.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
    ab1 = ab2 || ab3;
if(fo0 != null){
      fd1 = fo0.m3(ab4, fb0, fb1, ab1);
}
    for(int i0=0; i0<10; i0++){
        double ld0 = 168.53904440205025;
        ab2 = ab3 || ab4;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
        ab4 = fd1 > ld0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
        fd0 = fd1 - ld0;
        double ld1 = 743.3814428557124;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought36.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    fb0 = ad1 > ad2;
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    ad3 *= -1;
if(fo1 != null){
      ad4 = fo1.m3(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m2();
}
    fb0 = !fb1;
    lb1 = fd0 < fd1;
    ad1 *= -1;
    Thought lo2 = Thought83.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
    fb1 = lb1 && fb0;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = lb1 && fb0;
    Output.points[1][4] -= ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, lb1, fb0, fb1);
}
    Thought lo3 = Thought14.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
    Thought lo4 = Thought62.getInstance(ad2, ad3, ad4, fd0);

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
    double ld0 = 771.8813372006807;
        Thought lo1 = Thought47.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    fd1 *= -1;
if(fo1 != null){
      ld0 = fo1.m3(ab3, ab4, fb0, fb1);
}
    double ld2 = 135.00216836456437;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = !ab2;
    ld2 = ad1 - ad2;

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
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[1][5] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = true;
    boolean lb2 = false;
    lb1 = lb2 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb2);
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
    Thought lo0 = Thought35.getInstance(ao1, ao2, ao3, ao4);
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 - ad1;
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = ad2 < ad3;
        ad4 = fd0 - fd1;
        ad1 = ad2 - ad3;
if(ao4 != null){
          ao4.m3(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
        lb1 = fb0 || fb1;
        Thought lo2 = Thought76.getInstance(lb1, fb0, fb1, lb1);
        fd1 *= -1;
        fb0 = !fb1;
if(ao4 != null){
          ad1 = ao4.m3();
}
        lb1 = fb0 || fb1;
        if (lb1) {
if(fo0 != null){
              ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
            boolean lb3 = true;
            double ld4 = 431.39185472578566;
if(fo1 != null){
              fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld4, ad1, ad2, ad3, fb0, fb1, lb3, lb1);
}
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb3, lb1);
}
            fb0 = ad4 < fd0;
            fb1 = lb3 || lb1;
if(fo0 != null){
              fo0.m1(fd1, ld4, ad1, ad2);
}
}}
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
    fd0 = fd1 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fb1 = ab1 || ab2;
    ab3 = !ab4;
    fb0 = fd1 > fd0;
    if (fb1) {
        fd1 *= -1;
        fd0 *= -1;
        fd1 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        boolean lb0 = true;
        Output.points[1][6] -= fd0;
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
    Thought lo0 = Thought5.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    boolean lb1 = true;
    Thought lo2 = Thought28.getInstance(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb1);
    Thought lo3 = Thought27.getInstance(fd0, fd1, ad1, ad2);
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    ab1 = ad3 < ad4;
    ab2 = ab3 || ab4;
    boolean lb4 = true;
    fd0 *= -1;
    double ld5 = 503.61480936912636;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + ld5;
    boolean lb6 = false;
    ad1 = ad2 + ad3;
    lb4 = lb6 && ab1;
if(ao1 != null){
      ao1.m2(ad4, fd0, fd1, ld5, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    ld5 = ad1 - ad2;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ad3 = ad4 + fd0;
    double ld7 = 470.8180747817231;
    lb1 = fd0 < fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ld5, ld7, ad1, ad2, lb4, lb6, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = lb1 && lb4;

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
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    lb0 = !fb0;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought56.getInstance();
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
    lb0 = fb0 && fb1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    ab1 = fd0 > fd1;
    double ld0 = 872.7349964898098;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = fd0 < fd1;
    boolean lb2 = true;
    boolean lb3 = true;
    boolean lb4 = false;
    lb2 = ld0 < fd0;
    boolean lb5 = true;
    Thought lo6 = Thought37.getInstance(fd1, ld0, fd0, fd1);
    if (lb3) {
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
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo0 = Thought6.getInstance();
        ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;

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
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + ad1;
    ab4 = fb0 && fb1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
    double ld1 = 61.16184629751928;
if(fo0 != null){
      lb0 = fo0.m2(ab1, ab2, ab3, ab4);
}
    double ld2 = 25.457563436407124;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
}
    ab2 = ld2 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2, ab2, ab3, ab4, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    Output.points[1][7] -= fd0;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    double ld0 = 227.2567775928145;
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0);
}
    double ld2 = 453.3206762978985;
    lb1 = ld2 > fd0;
    fb0 = !fb1;
if(ao3 != null){
      lb1 = ao3.m2(fb0, fb1, lb1, fb0);
}
    fd1 = ld0 + ld2;

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
    Output.points[1][8] += ad1;
    ad2 = ad3 + ad4;
if(ao1 != null){
      ao1.m2();
}
    Output.points[2][0] += fd0;
    if (fb0) {
        fb1 = fb0 && fb1;
if(ao2 != null){
          fb0 = ao2.m2(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        ad4 = fd0 - fd1;
        ad1 *= -1;
        double ld0 = 749.5106392927281;
        fb1 = fb0 && fb1;
        fb0 = fb1 || fb0;
        fb1 = ad1 > ad2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        double ld1 = 145.7019616702737;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          ld0 = ao2.m3(ld1, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
        boolean lb2 = true;
        Thought lo3 = Thought56.getInstance(ao3, ao4, fo0, fo1, ld0, ld1, ad1, ad2);
        boolean lb4 = true;
        } else {
        Thought lo5 = Thought44.getInstance(fb0, fb1, fb0, fb1);
        fd0 = fd1 - ad1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ao2.m2();
}
    boolean lb1 = true;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, lb0, lb1, lb2, ab1);
}
    ab2 = fd1 < fd0;
    fd1 = fd0 - fd1;
    ab3 = fd0 > fd1;
    double ld3 = 82.40761817412671;
    ab4 = ld3 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ld3, fd0, fd1, ld3, fb0, fb1, lb0, lb1);
}
    lb2 = !ab1;
    Thought lo4 = Thought25.getInstance(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);

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
    ab1 = ad2 < ad3;
if(ao2 != null){
      ao2.m1(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ab3 = ao2.m2(ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
    ab1 = ab2 && ab3;
if(ao3 != null){
      fd1 = ao3.m3();
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
    if (ab4) {
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        Output.points[2][1] += fd0;
        fb0 = !fb1;
        fd1 = ad1 - ad2;
        Output.points[2][2] += ad3;
        ad4 = fd0 + fd1;
        ad1 = ad2 - ad3;
        lb0 = ab1 || ab2;
        double ld1 = 942.8239456824472;
        boolean lb2 = true;
        Thought lo3 = Thought34.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb2, lb0, ab1);
}
        ld1 *= -1;
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
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = !fb0;
    double ld1 = 547.2937056278162;
    fb1 = lb0 || fb0;

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
    fb0 = fb1 && fb0;
    double ld0 = 770.1280251485141;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    double ld1 = 15.96089814983355;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb1 = ld0 < ld1;
    fb0 = fd0 > fd1;
    ld0 *= -1;
    fb1 = fb0 || fb1;
    Thought lo2 = Thought45.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
    boolean lb3 = false;
    Thought lo4 = Thought6.getInstance(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb3);
    double ld5 = 254.2241394907789;
    fb0 = !fb1;
    lb3 = ld1 < ld5;
    Thought lo6 = Thought23.getInstance(fd0, fd1, ld0, ld1);
    Thought lo7 = Thought84.getInstance(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld0);
    ld1 = ld5 - fd0;
    boolean lb8 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb8, fb0, fb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      lb8 = fo1.m2(fd1, ld0, ld1, ld5, fb0, fb1, lb3, lb8);
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
    Output.points[2][3] -= fd1;
    fd0 *= -1;
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 *= -1;
    fd0 *= -1;
    fb0 = fb1 || fb0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
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
