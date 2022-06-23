package genetic;
import java.util.ArrayList;
class Thought43 extends Thought{
private static ArrayList<Thought43> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 644.9544666317796;
private double fd1 = 864.691490143893;
private Thought fo0 = null;
private Thought fo1 = null;
Thought43 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought43 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought43 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought43 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought43 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought43 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought43 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought43 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought43 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought43 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought43 instance = new Thought43 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought21.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[7][0] -= fd0;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo1 = Thought8.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
    fd1 = fd0 + fd1;
    lb2 = !fb0;
    fb1 = !lb2;
    fb0 = fd0 > fd1;
    Thought lo3 = Thought8.getInstance();
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fb0 = !fb1;
    fd1 = fd0 - fd1;
    lb2 = fb0 && fb1;

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
    if (ab1) {
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        double ld0 = 815.3947940717711;
        fb1 = fd0 > fd1;
        Output.points[7][1] += ld0;
        ab1 = fd0 > fd1;
        ab2 = ld0 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo1.m1(fd1, ld0, fd0, fd1);
}
        ld0 = fd0 + fd1;
        Output.points[7][2] -= ld0;
        fd0 = fd1 + ld0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
        ab1 = fd1 > ld0;
        Output.points[7][3] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        fd1 = ld0 - fd0;
        for(int i0=0; i0<10; i0++){
            Thought lo1 = Thought10.getInstance();
            fb1 = fd1 < ld0;
            ab1 = fd0 > fd1;
            ld0 = fd0 - fd1;
            ab2 = ld0 > fd0;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    ad4 = fd0 + fd1;
    double ld1 = 310.0151330220933;
    fb0 = fb1 && lb0;
    fb0 = ld1 > ad1;
    Thought lo2 = Thought51.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3);
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
    ab1 = !ab2;
    ad1 = ad2 - ad3;
    Thought lo0 = Thought53.getInstance(ab3, ab4, fb0, fb1);
    ab1 = ad4 > fd0;
    ab2 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought33.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    ab1 = fd1 > ad1;
    Thought lo2 = Thought77.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        } else {
        boolean lb3 = false;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}
        ab4 = !fb0;
        fd1 *= -1;
        fb1 = ad1 < ad2;
        ad3 = ad4 + fd0;
        Thought lo4 = Thought55.getInstance(fd1, ad1, ad2, ad3);
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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
        fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    fd0 *= -1;
    if (lb0) {
        Output.points[7][4] += fd1;
if(fo1 != null){
          fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
        fb1 = fd0 < fd1;
        boolean lb1 = true;
        lb1 = lb0 || fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, lb1, lb0, fb0);
}
        fb1 = fd1 > fd0;
        fd1 *= -1;
        lb1 = fd0 < fd1;
        fd0 = fd1 + fd0;
        fd1 *= -1;
        } else if (fb0) {
        fb1 = !lb0;
        fb0 = fb1 || lb0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo1.m3(fd0, fd1, fd0, fd1);
}
        boolean lb2 = false;
        Output.points[7][5] += fd0;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    double ld1 = 514.9535867900935;
if(ao4 != null){
      ao3 = ao4.m4();
}
    lb0 = !fb0;
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ad1, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    lb0 = ad2 > ad3;
    fb0 = !fb1;
    lb0 = ad4 > fd0;
    fb0 = !fb1;
    lb0 = fb0 || fb1;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
}
    Output.points[7][6] -= ad3;
    boolean lb2 = false;
    ad4 = fd0 + fd1;
    lb0 = ld1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2);
}
    ad3 = ad4 - fd0;

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
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao3.m1();
}
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Output.points[7][7] -= fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought30.getInstance(fo0, fo1, ao1, ao2);
    ab4 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1);
}
    ab3 = fd0 > fd1;
    ab4 = !fb0;
    fb1 = fd0 < fd1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    boolean lb2 = true;
    lb1 = lb2 && ab1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought42.getInstance();
    boolean lb4 = false;
    if (fb0) {
        Thought lo5 = Thought99.getInstance(fd0, fd1, fd0, fd1, fb1, lb1, lb2, lb4);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ab2 = !ab3;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < ad1;
    ab3 = ab4 && fb0;
    fb1 = ad2 < ad3;
    ab1 = ad4 < fd0;
    if (ab2) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 && ab3;
        fd1 *= -1;
        ad1 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
        ab4 = !fb0;
        double ld0 = 469.844986994857;
        fb1 = !ab1;
        boolean lb1 = false;
        Output.points[7][8] -= ld0;
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
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3();
}
    fb1 = fd1 < fd0;
    fb0 = !fb1;
    double ld0 = 795.8071793144044;
    double ld1 = 735.5463831748435;
    ld1 = fd0 + fd1;
    fb0 = ld0 > ld1;
    fb1 = fb0 && fb1;
    Output.points[8][0] += fd0;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld0;
    Thought lo2 = Thought96.getInstance(fo0, fo1, fo0, fo1);
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
    ab2 = ab3 && ab4;
    fd1 *= -1;
    Output.points[8][1] -= fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    double ld0 = 999.5060684744909;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0);
}
    ab4 = fd1 > ld0;
    fb0 = fd0 > fd1;
    fb1 = ld0 < fd0;
    ab1 = ab2 && ab3;
    Thought lo1 = Thought6.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);

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
    ad1 = ad2 + ad3;
    fb0 = fb1 && fb0;
    if (fb1) {
        ad4 = fd0 + fd1;
if(fo1 != null){
          ad1 = fo1.m3(fb0, fb1, fb0, fb1);
}
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
        double ld0 = 462.7033826231304;
        ad2 = ad3 - ad4;
        Output.points[8][2] -= fd0;
        boolean lb1 = true;
        lb1 = fb0 && fb1;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        double ld2 = 53.75372409764257;
        lb1 = ld0 > ld2;
        ad1 = ad2 - ad3;
        fb0 = ad4 > fd0;
        fb1 = lb1 || fb0;
        Output.points[8][3] += fd1;
        fb1 = lb1 || fb0;
        boolean lb3 = true;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ld0, ld2, ad1, ad2, fb0, fb1, lb1, lb3);
}
        boolean lb4 = true;
        lb4 = ad3 < ad4;
        Thought lo5 = Thought11.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb3);
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
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought25.getInstance(ab4, fb0, fb1, ab1);
if(fo1 != null){
      ab2 = fo1.m2();
}
if(fo0 != null){
      ab3 = fo0.m2(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
    Output.points[8][4] -= ad2;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought67.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
    boolean lb2 = true;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    double ld3 = 742.7012896869782;
    fb1 = !lb2;
    double ld4 = 536.1374737379248;
    ab1 = ab2 && ab3;
    ad2 *= -1;
if(fo0 != null){
      fo0.m3(ab4, fb0, fb1, lb2);
}
    ad3 = ad4 + fd0;
    boolean lb5 = true;

Thought.STACK_COUNTER++;
return lb5;
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
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought44.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        lb1 = fb0 || fb1;
        lb1 = fb0 || fb1;
        }
    lb1 = fb0 || fb1;
    lb1 = fd1 < fd0;
if(ao4 != null){
      fd1 = ao4.m3();
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
        double ld2 = 916.7925363215295;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb1);
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
    Thought lo0 = Thought1.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    fb0 = ad1 > ad2;
    fb1 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    Output.points[8][5] -= ad3;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(lb1, fb0, fb1, lb1);
}
    fb0 = ad3 > ad4;
if(ao3 != null){
      fd0 = ao3.m3();
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
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 || ab1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = fd0 - fd1;
        double ld0 = 76.97750488876358;
        fb1 = ld0 < fd0;
        fd1 = ld0 - fd0;
        Thought lo1 = Thought9.getInstance(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
        Thought lo2 = Thought26.getInstance(fd1, ld0, fd0, fd1);
        fb0 = !fb1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(ao1 != null){
          fd0 = ao1.m3(ab1, ab2, ab3, ab4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > ad1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    double ld0 = 294.8625749171676;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    Thought lo1 = Thought91.getInstance(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
if(ao3 != null){
      fb0 = ao3.m2(fd0, fd1, ld0, ad1);
}
    Thought lo2 = Thought10.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
if(ao2 != null){
      fb1 = ao2.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    boolean lb3 = false;
    fd1 = ld0 + ad1;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    lb3 = fd1 > ld0;
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4);
}
    Thought lo4 = Thought86.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    boolean lb5 = false;
    Thought lo6 = Thought53.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb3, lb5);

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
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    Output.points[8][6] += fd0;
    Thought lo0 = Thought50.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd1 > fd0;
    boolean lb1 = true;
    boolean lb2 = true;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld3 = 557.3306951038832;
    lb2 = ld3 < fd0;
    double ld4 = 215.45061400976877;

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
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    boolean lb0 = false;
    fd0 *= -1;
    ab4 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
    double ld1 = 806.2710731039682;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    ab3 = !ab4;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ab3 || ab4;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought43.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
    Thought lo1 = Thought3.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 *= -1;
    double ld2 = 339.3717009085121;
    boolean lb3 = true;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb4, fb0, fb1, lb3);
}
    double ld5 = 498.72472536648047;
    boolean lb6 = false;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld2, lb4, lb6, fb0, fb1);
}
    boolean lb7 = false;

Thought.STACK_COUNTER++;
return ld5;
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
    Thought lo0 = Thought1.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    Output.points[8][7] += fd0;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    fb1 = ab1 && ab2;
    ad2 = ad3 + ad4;
    double ld1 = 4.446648757570253;
    ab3 = ad4 > fd0;
    fd1 *= -1;
    boolean lb2 = false;
    double ld3 = 636.174150406541;
if(fo1 != null){
      ld1 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1();
}
    lb2 = ld3 > ad1;
    boolean lb4 = false;
    lb4 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    Thought lo5 = Thought30.getInstance(fo1, fo0, fo1, fo0);
    Output.points[8][8] += ld3;
    if (fb0) {
        fb1 = lb2 || lb4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        fd0 *= -1;
        Thought lo6 = Thought22.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb4);
        fd1 = ld1 - ld3;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought56.getInstance(fd1, fd0, fd1, fd0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Output.points[0][0] += fd0;
    fb1 = fd1 > fd0;
    fb0 = !fb1;
    Output.points[0][1] += fd1;
    fd0 = fd1 - fd0;

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
    fb0 = fb1 && fb0;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = true;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
    Thought lo1 = Thought94.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
    ad3 = ad4 - fd0;
    boolean lb2 = false;
    if (fb0) {
        double ld3 = 324.54532816281943;
        Thought lo4 = Thought47.getInstance(fd0, fd1, ld3, ad1);
        ad2 *= -1;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fb1 = fo0.m2(lb0, lb2, fb0, fb1);
}
        boolean lb5 = false;
if(ao1 != null){
          fo1 = ao1.m4();
}
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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Output.points[0][2] -= fd1;
    fb1 = ab1 && ab2;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Output.points[0][3] += fd0;
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ab4 = ao4.m2(fb0, fb1, lb0, ab1);
}
    ab2 = fd0 > fd1;
    Thought lo1 = Thought12.getInstance();
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    fd1 *= -1;
    Thought lo2 = Thought14.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 || fb1;
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
    ab1 = ad1 > ad2;
    Thought lo0 = Thought0.getInstance(ad3, ad4, fd0, fd1);
    ab2 = ad1 < ad2;
    ab3 = ad3 < ad4;
    fd0 = fd1 - ad1;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
    double ld2 = 830.8667458748541;
    Thought lo3 = Thought62.getInstance(ab4, fb0, fb1, lb1);
    fd0 = fd1 + ld2;
    Thought lo4 = Thought92.getInstance();
    Output.points[0][4] -= ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && lb1;
    ab1 = fd1 < ld2;
    Thought lo5 = Thought94.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    fb1 = !lb1;

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
    Output.points[0][5] += fd0;
    boolean lb0 = true;
    fb0 = fd1 < fd0;
    boolean lb1 = false;
    fb0 = !fb1;
    Thought lo2 = Thought18.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
    fd1 = fd0 + fd1;
    boolean lb3 = false;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo4 = Thought65.getInstance(lb1, lb3, fb0, fb1);
    boolean lb5 = true;
    double ld6 = 302.16808966631226;
        ld6 *= -1;
    double ld7 = 477.6924369341706;
if(fo0 != null){
      fo0.m3();
}
    lb0 = ld7 > fd0;
    lb1 = lb3 && lb5;
    boolean lb8 = true;
        Output.points[0][6] += fd1;
    Output.points[0][7] -= ld6;
if(fo1 != null){
      ld7 = fo1.m3(fd0, fd1, ld6, ld7, lb8, fb0, fb1, lb0);
}
    fd0 *= -1;
    lb1 = lb3 || lb5;
    for(int i0=0; i0<10; i0++){
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
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought64.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    ab3 = ab4 || fb0;
    Thought lo1 = Thought65.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2();
}
    double ld2 = 819.3493776337431;
    ld2 = fd0 + fd1;
    ld2 = fd0 + fd1;
    Thought lo3 = Thought99.getInstance(ld2, fd0, fd1, ld2, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb4 = false;
    Thought lo5 = Thought67.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb4, ab1);
    fd1 = ld2 + fd0;
    double ld6 = 266.9095171460879;
    fd0 *= -1;
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb4;

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
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0);
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought79.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    double ld1 = 658.3308354171289;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
}
    ld1 = ad1 + ad2;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 > ad3;
    ad4 *= -1;
    Thought lo0 = Thought85.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought69.getInstance(ad3, ad4, fd0, fd1);
    Output.points[0][8] += ad1;
    ad2 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3(ab4, fb0, fb1, lb2);
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
    Thought lo0 = Thought53.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    Output.points[1][0] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    fd1 *= -1;
    lb1 = !fb0;
if(ao3 != null){
      fb1 = ao3.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb2 = false;
    lb1 = fd1 < fd0;
    Output.points[1][1] -= fd1;
    boolean lb3 = false;
    fd0 = fd1 + fd0;
if(ao4 != null){
      fd1 = ao4.m3(lb2, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
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
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
    Output.points[1][2] += ad3;
    fb0 = !fb1;
    ad4 = fd0 - fd1;
    Thought lo1 = Thought30.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
    fd0 = fd1 + ad1;
if(ao1 != null){
      ad2 = ao1.m3(lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld2 = 68.43965317146099;
    fb0 = fb1 && lb0;
    for(int i0=0; i0<10; i0++){
        double ld3 = 671.8172036539565;
        boolean lb4 = false;
        lb0 = fb0 && fb1;
if(ao4 != null){
          ao4.m3(ad1, ad2, ad3, ad4, lb4, lb0, fb0, fb1);
}
        boolean lb5 = false;
        Output.points[1][3] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        fd1 *= -1;
        lb4 = ld3 > ld2;
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
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
        Thought lo0 = Thought90.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
    double ld1 = 843.0489851189025;
    Thought lo2 = Thought4.getInstance();
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo3 = Thought70.getInstance(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1, fb0, fb1, ab1, ab2);
    boolean lb4 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fd1 = ao4.m3(ld1, fd0, fd1, ld1);
}
    double ld5 = 417.9173559001662;
    fb1 = ld5 > fd0;
    lb4 = ab1 || ab2;
    fd1 = ld1 + ld5;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld1, ld5, fd0);
}
    ab3 = !ab4;
    boolean lb6 = true;

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
    Thought lo0 = Thought38.getInstance(ab2, ab3, ab4, fb0);
    Output.points[1][4] += ad2;
    double ld1 = 889.027034774534;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad2 *= -1;
    ad3 = ad4 - fd0;
    fb1 = fd1 < ld1;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo2 = Thought69.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ad1, fb0, fb1, ab1, ab2);
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;

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
if(fo1 != null){
      fo1.m2();
}
    double ld0 = 274.4865037485118;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
    double ld1 = 546.086485652511;
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld1);
}
    fd0 *= -1;
    fb0 = fb1 && fb0;
    fb1 = fd1 > ld0;
    fb0 = !fb1;
    ld1 = fd0 - fd1;
    fb0 = fb1 || fb0;
    ld0 = ld1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0);
}
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m2();
}
    Thought lo3 = Thought72.getInstance(ld1, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
    Output.points[1][5] -= ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
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
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    Output.points[1][6] -= fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld0 = 905.367563292509;
if(fo1 != null){
      ld0 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought98.getInstance(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
        lb2 = !fb0;
    Thought lo3 = Thought47.getInstance(ld0, fd0, fd1, ld0);
    fb1 = !lb2;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
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
    fb0 = fb1 && fb0;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    Thought lo1 = Thought23.getInstance();
    double ld2 = 274.808517561717;
    ld2 = fd0 - fd1;
    Output.points[1][7] -= ld2;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld2, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    fd1 = ld2 + fd0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fb0 = ld2 < fd0;
    fb1 = fd1 > ld2;
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
